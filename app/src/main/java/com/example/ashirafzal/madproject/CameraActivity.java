package com.example.ashirafzal.madproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

     /*
    App Version : 1
    Author : Ashir Afzal
    Project : MAD Project
    Project Created on 02 - January - 2019
     */

public class CameraActivity extends AppCompatActivity {

    /*
    This imageView is used to hold the Capture Image
    You Could Change the camera request value if you want to
     */

    ImageView imageView;
    public static final int CAMERA_REQUEST = 9999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        imageView = findViewById(R.id.imageView);
    }


    /*
    On camera method capture the image we used onClick in our button in XML file activity_camera.xml
     */

    public void OpenCamera(View view){

        /*
        Media Store is a builtin class in android studio and Action_image_capture is a part of it.
         */

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,CAMERA_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        /*
        Bitmap isliye use karten jab hume camera se image capture ke baad usi activity me wapas ana ho
        jahan se humne capture click karne ke liye click kiya ho
         */

        if(requestCode==CAMERA_REQUEST){
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }


    }

}
