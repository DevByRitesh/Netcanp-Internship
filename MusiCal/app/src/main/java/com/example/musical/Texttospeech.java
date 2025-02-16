package com.example.musical;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Texttospeech extends AppCompatActivity {
    ImageView i9;
    Button b24,b25;
    TextToSpeech ts;
    EditText e5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texttospeech);
        e5=(EditText) findViewById(R.id.editTextTextPersonName5);
        b24=(Button) findViewById(R.id.button24);
        b25=(Button) findViewById(R.id.button25);
        ts= new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.7f);
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e5.getText().toString();
                ts.speak(s1,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i11=new Intent(Texttospeech.this,allfunctionpage.class);
                startActivity(i11);
                finish();
            }
        });

    }


    }
