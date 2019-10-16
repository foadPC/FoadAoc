package com.foad.user.foadaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ManagerOrUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_or_user);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.managerusermenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
    switch (item.getItemId()) {
        case R.id.settings:
            startActivity(new Intent(this, ManagerOrUser.class));
            return true;
        case R.id.logout:
            startActivity(new Intent(this, MainActivity.class));
            return true;
        default:
            return super.onOptionsItemSelected(item);
    }
    }
}
