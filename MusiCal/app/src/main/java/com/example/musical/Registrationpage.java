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

public class Registrationpage extends AppCompatActivity {
    ImageView i2;
    EditText e1,e2;
    Button b3,b4;
    ProgressBar p1;
    FirebaseAuth f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationpage);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        p1=(ProgressBar) findViewById(R.id.progressBar);
        e1=(EditText) findViewById(R.id.editTextTextPersonName);
        e2=(EditText) findViewById(R.id.editTextTextPersonName2);
        e2.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        f1=FirebaseAuth.getInstance();
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Registrationpage.this,MainActivity.class);
                startActivity(i1);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.isEmpty()){
                    e1.setError("fill email");
                    return;
                }
                else {
                    if(s2.isEmpty()){
                        e2.setError("fill password");
                        return;
                    }
                    else{
                        p1.setVisibility(View.VISIBLE);
                        f1.createUserWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                        Toast.makeText(Registrationpage.this, "Database Updated", Toast.LENGTH_SHORT).show();
                                        p1.setVisibility(View.INVISIBLE);
                                        Intent i1 = new Intent(Registrationpage.this, MainActivity.class);
                                        startActivity(i1);
                                        finish();
                                    } else {
                                        Toast.makeText(Registrationpage.this, "Database Not Updated", Toast.LENGTH_SHORT).show();
                                        p1.setVisibility(View.INVISIBLE);
                                    }

                                }
                        });

                    }
                }
            }

        });

    }
}