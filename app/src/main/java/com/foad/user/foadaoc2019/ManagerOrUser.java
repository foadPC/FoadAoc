package com.foad.user.foadaoc2019;

import android.content.Intent;
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
        getMenuInflater().inflate(R.menu.managerusermenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            case R.id.logout:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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




