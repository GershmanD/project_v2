package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,
                        LogIn.class);
                startActivity(intent);
                finish();

            }
        },3000);


// от логина к трип скрину сделать переход . DID IT
// аррай лист от автобусов надо сдлеать что бы работало грид вью.
// сделать на отдельном масахе что бы был листвью учеников. ???????????????????????

    }
}