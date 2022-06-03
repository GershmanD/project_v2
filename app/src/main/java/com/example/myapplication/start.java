package com.example.myapplication;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class start extends Daniel_Template_Screen {
    Handler handler;
    ImageView img_Logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        img_Logo = findViewById(R.id.iv_logo);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(start.this,
                        mail_pass.class);
                startActivity(intent);
                finish();

            }
        },3000);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        img_Logo.startAnimation(animation);

    }
}