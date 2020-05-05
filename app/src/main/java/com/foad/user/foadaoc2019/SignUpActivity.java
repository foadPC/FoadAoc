 package com.foad.user.foadaoc2019;

import android.content.Intent;
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

 public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{
     private static final String TAG = "Firebase";
     EditText editTextFirstName,editTextLastName,editTextEmailSign,editTextPasswordSign,editTextConfirmPassword;
    Button confirm;
     private FirebaseAuth mAuth;


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

        mAuth = FirebaseAuth.getInstance();


    }
     @Override
     public void onStart() {
         super.onStart();
         // Check if user is signed in (non-null) and update UI accordingly.
         FirebaseUser currentUser = mAuth.getCurrentUser();
       //  updateUI(currentUser);
     }
     public void createAccount(String email, String password){
         mAuth.createUserWithEmailAndPassword(email, password)
                 .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         if (task.isSuccessful()) {
                             // Sign in success, update UI with the signed-in user's information
                             Log.d(TAG, "createUserWithEmail:success");
                             FirebaseUser user = mAuth.getCurrentUser();
                    //         updateUI(user);
                             //intent
                             Intent i = new Intent(SignUpActivity.this, LogInActivity.class);
                             startActivity(i);
                         } else {
                             // If sign in fails, display a message to the user.
                             Log.w(TAG, "createUserWithEmail:failure", task.getException());
                             Toast.makeText(SignUpActivity.this, "Authentication failed.",
                                     Toast.LENGTH_SHORT).show();
                     //        updateUI(null);
                         }

                         // ...
                     }
                 });
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
                createAccount( editTextEmailSign.getText().toString(), editTextPasswordSign.getText().toString());
            }
        }



    }



}
