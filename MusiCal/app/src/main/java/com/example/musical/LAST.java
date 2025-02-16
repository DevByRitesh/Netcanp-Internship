package com.example.musical;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LAST extends AppCompatActivity {
    ImageView i11;
    Button b31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        b31=(Button)findViewById(R.id.button31);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i56=new Intent(LAST.this,MainActivity.class);
                startActivity(i56);
                finish();
            }
        });
    }
}