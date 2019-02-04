package com.example.aroe.menunextpage;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    Handler britney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        britney = new Handler();
        britney.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent ladygaga = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(ladygaga);
                finish();
            }
        },5*1000 );

    }





}
