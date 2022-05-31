package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Create_enter_trip extends AppCompatActivity {
    Button enter_to_trip;
    private EditText key_of_trip;
    private String key = "123";
    Button btn_log_out;
    Button btn_create_trip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_to_trip);
        key_of_trip = findViewById(R.id.et_key_of_trip);
        enter_to_trip = (Button) findViewById(R.id.enter_to_trip);
        btn_log_out = findViewById(R.id.btn_log_out);
        btn_log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        enter_to_trip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(key_of_trip.getText().toString().equals(key)) {
                    Intent intent = new Intent(Create_enter_trip.this,
                            MainActivity.class);
                    startActivity(intent);

                }
            }
        });
        btn_create_trip = findViewById(R.id.btn_create_trip);
        btn_create_trip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Create_enter_trip.this, CreateTrip.class);
                startActivity(intent);
            }
        });
    }
}