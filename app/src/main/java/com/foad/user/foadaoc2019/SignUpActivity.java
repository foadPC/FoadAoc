package com.foad.user.foadaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        confirm = findViewById(R.id.confirm);
        confirm.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v==confirm){
            Intent i = new Intent(this, LogInActivity.class);
            startActivity(i);
        }
    }


}
