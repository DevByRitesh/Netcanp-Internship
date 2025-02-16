package com.example.musical;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Loginpage extends AppCompatActivity {
    ImageView i3;
    Button b5,b33;
    FirebaseAuth f2;
    ProgressBar p2;
    EditText e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        b5=(Button) findViewById(R.id.button5);
        b33=(Button) findViewById(R.id.button33);
        p2=(ProgressBar) findViewById(R.id.progressBar2);
        e3=(EditText) findViewById(R.id.editTextTextPersonName3);
        e4=(EditText) findViewById(R.id.editTextTextPersonName4);
        e4.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        f2=FirebaseAuth.getInstance();
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Loginpage.this,MainActivity.class);
                startActivity(i1);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e3.getText().toString();
                String s2=e4.getText().toString();
                if(s1.isEmpty()){
                    e3.setError("fill email");
                    return;
                }
                else {
                    if(s2.isEmpty()){
                        e4.setError("fill password");
                        return;
                    }
                    else{
                        p2.setVisibility(View.VISIBLE);
                        f2.signInWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(Loginpage.this, "Database Updated", Toast.LENGTH_SHORT).show();
                                    p2.setVisibility(View.INVISIBLE);
                                    Intent i1=new Intent(Loginpage.this,allfunctionpage.class);
                                    startActivity(i1);
                                    finish();

                                }
                                else {
                                    Toast.makeText(Loginpage.this, "Database Not Updated", Toast.LENGTH_SHORT).show();
                                    p2.setVisibility(View.INVISIBLE);
                                }

                            }
                        });

                    }
                }
            }
        });

    }
}