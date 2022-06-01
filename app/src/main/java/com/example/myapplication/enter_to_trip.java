package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class enter_to_trip extends AppCompatActivity {
    private Button enter_to_trip;
    private EditText key_of_trip;
    private String key = "123";
    Button btn_log_out;
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
            }//
        });
        enter_to_trip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(key_of_trip.getText().toString().equals(key)) {
                Intent intent = new Intent(com.example.myapplication.enter_to_trip.this,
                        MainActivity.class);
                startActivity(intent);

                } else {
                    Toast toast = Toast.makeText(com.example.myapplication.enter_to_trip.this, "Availed key", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}