package com.foad.user.foadaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonLogin, buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);

        buttonSignUp = findViewById(R.id.buttonSignUp);
        buttonSignUp.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v == buttonLogin) {
            Intent i = new Intent(this, LogInActivity.class);
            startActivity(i);
        }
        if (v == buttonSignUp) {
            Intent i = new Intent(this, SignUpActivity.class);
            startActivity(i);
        }
    }
}
