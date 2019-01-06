package com.example.ashirafzal.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /*
    App Version : 1
    Author : Ashir Afzal
    Project : MAD Project
    Project Created on 02 - January - 2019
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    This is the Sceond Actiivity  After Splash Which enavles the User to go Login Actitivty if register
    and if not register on the Firebase Cloud he or she could register itself
     */

    public void btnRegistration_Click(View v) {
        Intent i = new Intent(MainActivity.this, RegistrationActivity.class);
        startActivity(i);
    }
    public void btnLogin_Click(View v) {
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
    }

}