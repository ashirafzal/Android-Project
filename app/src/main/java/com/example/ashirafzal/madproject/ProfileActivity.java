package com.example.ashirafzal.madproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    /*
    App Version : 1
    Author : Ashir Afzal
    Project : MAD Project
    Project Created on 02 - January - 2019
     */

    private TextView tvEmail;
    Button Database,Camera,Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvEmail = (TextView) findViewById(R.id.tvEmailProfile);
        tvEmail.setText(getIntent().getExtras().getString("Email"));
        Database = findViewById(R.id.Database);
        Camera = findViewById(R.id.Camera);
        Image = findViewById(R.id.Image);

        /*
           This send to DBActitivity Which perorms the internal SQL Lite DataBase
         */

        Database.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,DBActivity.class);
                startActivity(intent);
            }
        });

        /*
            This send to CameraActitivity Which perorms the internal Camera Function
         */

        Camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,CameraActivity.class);
                startActivity(intent);
            }
        });

        /*
        This send to ImageActitivity Which perorms the Upload and Retrieve Image Task Online usingFirebase
                 */

        Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,ImageActivity.class);
                startActivity(intent);
            }
        });


    }
}