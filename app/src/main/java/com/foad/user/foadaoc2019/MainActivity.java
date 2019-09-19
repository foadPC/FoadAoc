package com.foad.user.foadaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String password = getIntent().getStringExtra(name:"password");

        String email = getIntent().getStringExtra(name:"email");

        tvEmail = findViewById(R.id.tvEmail);
        tvPassword = findViewById(R.id.tvPassword);

        tvEmail.setText(email);
        tvPassword.setText(password);


    }
}
