package com.foad.user.foadaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MachinesActivity extends AppCompatActivity implements View.OnClickListener{
    Button respButton,sleepButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machines_activty);

         sleepButton= findViewById(R.id.sleepButton);
         sleepButton.setOnClickListener(this);

        respButton = findViewById(R.id.respButton);
        respButton.setOnClickListener(this);
    }
    public void onClick(View v){
        if (v == respButton) {
            Intent i = new Intent(this, MachineListActivity.class);
            startActivity(i);
        }
        if (v == sleepButton){
            Intent i = new Intent(this, MachineListActivity.class);
            startActivity(i);
        }
    }
}
