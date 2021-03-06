package com.foad.user.foadaoc2019;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "FIREBASE";
    //    //1. properties definition (הצהרה)
    EditText editTextEmail, editTextPassword;
    Button buttonLogIn, buttonSignUp;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        mAuth = FirebaseAuth.getInstance();

        //2. initialize properties
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);

        buttonLogIn = findViewById(R.id.buttonLogIn);
        buttonLogIn.setOnClickListener(this);


        buttonSignUp = findViewById(R.id.buttonSignUp);
        buttonSignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == buttonLogIn) {

            if (editTextPassword.getText().toString().equals("")
                    || editTextEmail.getText().toString().equals("")) {
                Toast.makeText(this, "Empty Password Or Email", Toast.LENGTH_LONG).show();
            } else {
                logIn(editTextEmail.getText().toString(), editTextPassword.getText().toString() );

            }
        }
        if (v == buttonSignUp) {
            Intent i = new Intent(this, SignUpActivity.class);
            startActivity(i);
        }
    }

    public void logIn(String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            Intent i = new Intent(LogInActivity.this, ManagerOrUser.class);
                            startActivity(i);
                            // FirebaseUser user = mAuth.getCurrentUser();
                            //  updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(LogInActivity.this, "Wrong Email Or Password.",
                                    Toast.LENGTH_SHORT).show();
                            //updateUI(null);
                        }
                    }
                });
    }

}
