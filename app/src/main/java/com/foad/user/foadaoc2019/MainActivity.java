package com.foad.user.foadaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView tvEmail,tvPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String password = getIntent().getStringExtra("password");

        String email = getIntent().getStringExtra("email");

        tvEmail = findViewById(R.id.editTextEmail);
        tvPassword = findViewById(R.id.editTextPassword);

        tvEmail.setText(email);
        tvPassword.setText(password);


    }
}
