package com.example.musical;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class allfunctionpage extends AppCompatActivity {
    ImageView i4;
    Button b6,b7,b8,b11,b32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allfunctionpage);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b11=(Button)findViewById(R.id.button11);
        b32=(Button)findViewById(R.id.button32);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(allfunctionpage.this, MusicMainActivity.class);
                startActivity(i1);
                finish();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(allfunctionpage.this,flashlight.class);
                startActivity(i2);
                finish();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(allfunctionpage.this,Texttospeech.class);
                startActivity(i3);
                finish();
            }
        });


        b11.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(allfunctionpage.this,Calculator.class);
                startActivity(i6);
                finish();
            }
        }));
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7=new Intent(allfunctionpage.this,LAST.class);
                startActivity(i7);
                finish();
            }
        });

    }
}