package com.example.ashirafzal.madproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    /* Below value equivalent to 3 sec time for the splash screen */

    private static int SPLASH_TIME_OUT = 1500;

     /*
    App Version : 1
    Author : Ashir Afzal
    Project : MAD Project
    Project Created on 02 - January - 2019
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /* Post Delayed Method to create a splash screen to make thread waiting that
        * the background works complete in the background in terms of if app is being slow to respond
        * in milli seconds
        * */


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);


    }
}
