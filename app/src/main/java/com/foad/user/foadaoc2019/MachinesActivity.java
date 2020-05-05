package com.foad.user.foadaoc2019;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MachinesActivity extends AppCompatActivity implements View.OnClickListener{
    Button respButton,sleepButton;




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logoutmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        AlertDialog.Builder Builder = new AlertDialog.Builder(MachinesActivity.this);
        Builder.setMessage("Are You Sure You Want To Log Out?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        MachinesActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog Alert = Builder.create();
        Alert.show();

        return true;
    }

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
