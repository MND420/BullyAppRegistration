package com.mndproductions.android.bullyappregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmation extends AppCompatActivity {

    private TextView congratsView, usernameView, emailView, passwordView, questionView, answerView;
    private Button complete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        congratsView = findViewById(R.id.congratsView);
        usernameView = findViewById(R.id.usernameView);
        emailView = findViewById(R.id.emailView);
        passwordView = findViewById(R.id.passwordView);
        questionView = findViewById(R.id.questionView);
        answerView = findViewById(R.id.answerView);

        congratsView.setText("Congratulations on successful registration "+getIntent().getStringExtra("NAME"));
        usernameView.setText("Username: "+getIntent().getStringExtra("USERNAME"));
        emailView.setText("E-mail : "+getIntent().getStringExtra("EMAIL"));
        passwordView.setText("Password: "+getIntent().getStringExtra("PASSWORD"));
        questionView.setText("Security Question: "+getIntent().getStringExtra("QUESTION"));
        answerView.setText("Security Answer: "+getIntent().getStringExtra("ANSWER"));

        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //INPUT CODE FOR RETURN TO LOGIN PAGE
            }
        });

    }
}
