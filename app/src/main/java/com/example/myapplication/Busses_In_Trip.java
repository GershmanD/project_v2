package com.example.myapplication;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Busses_In_Trip extends Daniel_Template_Screen {
    EditText etTitle,etBody;
    Button btnSave;
    FirebaseDatabase database;
    DatabaseReference trip_ref;
    ListView lv_busses;
    String trip_key;
    Trip trip;
    FloatingActionButton fb_all_busses_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busses_in_trip);
        lv_busses = findViewById(R.id.lv_busses);
        database = FirebaseDatabase.getInstance();
        fb_all_busses_add = findViewById(R.id.fb_all_busses_add);
        fb_all_busses_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Busses_In_Trip.this, Add_Bus.class);
                intent.putExtra("trip_key", trip.getKey());
                startActivity(intent);
            }
        });
        /*
        etTitle = (EditText) findViewById(R.id.etTitle);
        etBody = (EditText) findViewById(R.id.etBody);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        Intent intent = getIntent();

        trip_key = intent.getExtras().getString("trip_key");
        trip_ref = database.getReference(Trip_DatabseName+"/" + trip_key);
        this.retrieveData();
    }

    public void retrieveData() {
        trip_ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                trip = dataSnapshot.getValue(Trip.class);
                etBody.setText(trip.getDate());
                etTitle.setText(trip.get);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
    @Override
    public void onClick(View v) {
        postRef = database.getReference("Posts/" + p.key);

        p.uid = FirebaseAuth.getInstance().getCurrentUser().getUid();
        p.title = etTitle.getText().toString();
        p.body = etBody.getText().toString();
        p.likes = 0;
        postRef.setValue(p);

        finish();


*/
    }
}