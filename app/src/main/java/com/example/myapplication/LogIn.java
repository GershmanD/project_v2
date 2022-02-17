package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {
    private Button enter_to_trip;
    private EditText key_of_trip;
    private String key = "123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        key_of_trip = findViewById(R.id.et_key_of_trip);
        enter_to_trip = (Button) findViewById(R.id.enter_to_trip);
        enter_to_trip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(key_of_trip.getText().toString().equals(key)) {
                Intent intent = new Intent(LogIn.this,
                        TripScreen.class);
                startActivity(intent);
                finish();
                }
            }
        });
    }
}