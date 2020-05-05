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

public class ManagerOrUser extends AppCompatActivity implements View.OnClickListener {

    Button ManagerButton, UserButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_or_user);

        ManagerButton = findViewById(R.id.ManagerButton);
        ManagerButton.setOnClickListener(this);

        UserButton = findViewById(R.id.UserButton);
        UserButton.setOnClickListener(this);



    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logoutmenu, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
                AlertDialog.Builder Builder = new AlertDialog.Builder(ManagerOrUser.this);
                  Builder.setMessage("Are You Sure You Want To Log Out?")
                          .setCancelable(false)
                          .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                              @Override
                              public void onClick(DialogInterface dialogInterface, int which) {
                                  ManagerOrUser.this.finish();
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






    public void onClick(View v) {
        if (v == ManagerButton) {
            Intent i = new Intent(this, MachinesActivity.class);
            startActivity(i);
        }
        if (v == UserButton) {
            Intent i = new Intent(this, MachinesActivity.class);
            startActivity(i);
        }

        }
    }








