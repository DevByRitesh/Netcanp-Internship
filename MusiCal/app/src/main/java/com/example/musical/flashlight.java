package com.example.musical;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class flashlight extends AppCompatActivity {
    ImageView i6;
    Button b15,b16,b17;
    CameraManager cm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashlight);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);
        b17=(Button)findViewById(R.id.button17);
        cm=(CameraManager)getSystemService(CAMERA_SERVICE);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String s1=cm.getCameraIdList()[0];
                    cm.setTorchMode(s1,true);
                }catch (CameraAccessException e)
                {

                }

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String s1=cm.getCameraIdList()[0];
                    cm.setTorchMode(s1,false);
                }catch (CameraAccessException e)
                {

                }

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8=new Intent(flashlight.this,allfunctionpage.class);
                startActivity(i8);
                finish();
            }
        });

    }
}