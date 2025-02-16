package com.example.musical;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Calculator extends AppCompatActivity  {
    ImageView i10;
    EditText e6,e7;
    TextView t1;
    Button b26,b27,b28,b29,b30;
    TextToSpeech ts;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b26=(Button)findViewById(R.id.button26);
        b27=(Button)findViewById(R.id.button27);
        b28=(Button)findViewById(R.id.button28);
        b29=(Button)findViewById(R.id.button29);
        b30=(Button)findViewById(R.id.button30);
        t1=(TextView)findViewById(R.id.textView);
        e6=(EditText)findViewById(R.id.editTextTextPersonName6);
        e7=(EditText)findViewById(R.id.editTextTextPersonName7);
        ts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.7f);
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Integer i1=Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);
                Integer i3=i1+i2;
                String s3=Integer.toString(i3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null);
                t1.setText(s3);
                Toast.makeText(Calculator.this,s3,Toast.LENGTH_SHORT).show();

            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Integer i1=Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);
                Integer i3=i1-i2;
                String s3=Integer.toString(i3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null);
                t1.setText(s3);
                Toast.makeText(Calculator.this,s3, Toast.LENGTH_SHORT).show();

            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Integer i1=Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);
                Integer i3=i1*i2;
                String s3=Integer.toString(i3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null);
                t1.setText(s3);
                Toast.makeText(Calculator.this,s3,Toast.LENGTH_SHORT).show();

            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Integer i1=Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);
                Integer i3=i1/i2;
                String s3=Integer.toString(i3);
                ts.speak(s3,TextToSpeech.QUEUE_FLUSH,null);
                t1.setText(s3);
                Toast.makeText(Calculator.this,s3,Toast.LENGTH_SHORT).show();

            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7=new Intent(Calculator.this,allfunctionpage.class);
                startActivity(i7);
                finish();
            }
        });


    }
}