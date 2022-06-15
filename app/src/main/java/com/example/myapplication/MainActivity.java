package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_send_geopos;
    Button btn_send_message;
    Button btn_check_nohahut;
    Button btn_go_to_gridview;
    Button btn_change_key;
    Intent intent;
    String trip_key="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = getIntent();
        trip_key = intent.getStringExtra("name");
        btn_change_key = findViewById(R.id.btn_change_key);
        btn_change_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,
                        All_Trips.class));
            }
        });

        btn_check_nohahut = findViewById(R.id.btn_to_check_attendance);
        btn_check_nohahut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_go_to_gridview = findViewById(R.id.btn_to_gridview);

        btn_go_to_gridview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TripScreen.class);
                startActivity(intent);
            }
        });

        btn_send_geopos = findViewById(R.id.btn_send_geopos);
        btn_send_geopos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GetLocation.class);
                startActivity(intent);
            }
        });
        btn_send_message = findViewById(R.id.btn_to_send_message);
    }

}