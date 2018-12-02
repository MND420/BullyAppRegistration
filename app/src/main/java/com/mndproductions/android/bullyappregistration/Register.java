package com.mndproductions.android.bullyappregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private Button register;
    private EditText name, username, email, password,  security, security_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.name);
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        security = findViewById(R.id.security);
        security_answer = findViewById(R.id.security_answer);

        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Register.this,"Registration Complete!", Toast.LENGTH_SHORT).show();
                openConfirmation();

            }
        });
    }

    public void openConfirmation(){
        String nameValue = name.getText().toString();
        String unValue = username.getText().toString();
        String emailValue =email.getText().toString();
        String passwordValue = password.getText().toString();
        String securityValue = security.getText().toString();
        String answerValue = security_answer.getText().toString();

        Intent intent = new Intent(this, Confirmation.class);
        intent.putExtra("NAME",nameValue);
        intent.putExtra("USERNAME",unValue);
        intent.putExtra("EMAIL",emailValue);
        intent.putExtra("PASSWORD",passwordValue);
        intent.putExtra("QUESTION",securityValue);
        intent.putExtra("ANSWER",answerValue);
        startActivity(intent);

    }
}
