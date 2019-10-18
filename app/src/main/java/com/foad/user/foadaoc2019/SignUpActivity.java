 package com.foad.user.foadaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editTextFirstName,editTextLastName,editTextEmailSign,editTextPasswordSign,editTextConfirmPassword;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextEmailSign = findViewById(R.id.editTextEmailSign);
        editTextPasswordSign = findViewById(R.id.editTextPasswordSign);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);


        confirm = findViewById(R.id.confirm);
        confirm.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v==confirm){
            if (editTextFirstName.getText().toString().equals("")
                    || editTextLastName.getText().toString().equals("")
                    || editTextEmailSign.getText().toString().equals("")
                    || editTextPasswordSign.getText().toString().equals("")
                    || editTextConfirmPassword.getText().toString().equals(""))
            {
                Toast.makeText(this, "A Field Is Empty", Toast.LENGTH_LONG).show();
            }
            else if((!editTextConfirmPassword.getText().toString().equals(editTextPasswordSign.getText().toString()))){
                Toast.makeText(this, "Passwords Don't Match", Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(this, LogInActivity.class);
                startActivity(i);
            }
        }


    }

}
