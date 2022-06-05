package com.example.myapplication;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

public class enter_to_trip extends Daniel_Template_Screen implements View.OnClickListener {
    private FloatingActionButton enter_to_trip;
    private EditText etKey, etEmail, etPass;    //dialogs
    private String key = "";
    Button btn_LogOut, btn_LogIn, btnSubmit_Admin;  //dialogs
    ImageButton btn_admin, btn_teacher, btn_contact;
    ImageView img_bus;
    ConstraintLayout enter_screen_layout;
    Dialog d;
    int count = 0;
    DatabaseReference managers_ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_to_trip);

        referencingAll();


    }

    private void referencingAll() {
        d = new Dialog(this);
        enter_screen_layout = findViewById(R.id.enter_screen_layout);
        img_bus = findViewById(R.id.img_bus);
        moveImage(getApplicationContext(), img_bus);
        enter_to_trip = findViewById(R.id.enter_to_trip);
        btn_admin = findViewById(R.id.btn_admin);
        btn_teacher = findViewById(R.id.btn_teacher);
        btn_contact = findViewById(R.id.btn_contact);
        btn_admin.setOnClickListener(this);
        btn_teacher.setOnClickListener(this);
        btn_contact.setOnClickListener(this);

        registerForContextMenu(btn_teacher);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        // you can set menu header with title icon etc
        menu.setHeaderTitle("Choose an action");
        // add menu items
        menu.add(0, v.getId(), 0, "Enter to trip");
        menu.add(0, v.getId(), 0, "Logout");
        menu.add(0, v.getId(), 0, "relaxation");
    }

    // menu item select listener
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getTitle() == "Enter to trip") {
            createTeacher_Dialog();
        } else if (item.getTitle() == "Logout") {
            finish();
        } else if (item.getTitle() == "relaxation") {
            Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse(
                    "https://www.youtube.com/watch?v=z6EchXyieos&t=9s&ab_channel=FunniestAnimalsEver"));
            startActivity(intent);
        }

        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_LogIn:
                if (etKey.getText().toString().equals(key)) {
                    Intent intent = new Intent(com.example.myapplication.enter_to_trip.this,
                            MainActivity.class);
                    startActivity(intent);

                } else {
                    makeSnakebar(this, enter_screen_layout, "wrong key!");
                }
                break;
            case R.id.btn_admin:
                createAdmin_Dialog();
                break;
            case R.id.btn_contact:

                break;

            case R.id.btnSubmit_Admin:
                checkAdmin();
                break;
        }
    }

    private void checkAdmin() {
        String name = etEmail.getText().toString();
        String phone = etPass.getText().toString();
        managers_ref = FirebaseDatabase.getInstance().
                getReference(Management_DatabseName + "/");
        managers_ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot data : snapshot.getChildren()) {
                    String adminName = data.child("name").getValue().toString();
                    String adminPhone = data.child("phone").getValue().toString();
                    if (adminName.equals(name) && adminPhone.equals(phone))
                        startActivity(new Intent(getApplicationContext(),
                                MainActivity.class));
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void createTeacher_Dialog() {
        d.setContentView(R.layout.teacher_dialog);
        d.setTitle("Select an option");
        d.setCancelable(true);
        etKey = d.findViewById(R.id.etKey);
        btn_LogIn = d.findViewById(R.id.btn_LogIn);
        btn_LogOut = d.findViewById(R.id.btn_LogOut);
        btn_LogOut.setOnClickListener(this);
        btn_LogIn.setOnClickListener(this);
        d.show();

    }

    public void createAdmin_Dialog() {
        d = new Dialog(this);
        d.setContentView(R.layout.admin_dialog);
        d.setTitle("Login");
        d.setCancelable(true);
        etEmail = (EditText) d.findViewById(R.id.etEmail);
        etPass = (EditText) d.findViewById(R.id.etPass);
        btnSubmit_Admin = (Button) d.findViewById(R.id.btnSubmit_Admin);
        btnSubmit_Admin.setOnClickListener(this);
        d.show();

    }
}