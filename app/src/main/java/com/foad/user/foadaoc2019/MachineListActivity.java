package com.foad.user.foadaoc2019;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MachineListActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "FIREBASE";
    ListView machineList;
    Button addMachineButton;
    ArrayList<Machine> machines = new ArrayList<>();
    CustomAdapter adapter;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logoutmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        AlertDialog.Builder Builder = new AlertDialog.Builder(MachineListActivity.this);
        Builder.setMessage("Are You Sure You Want To Log Out?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        MachineListActivity.this.finish();
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
        setContentView(R.layout.activity_machine_list);

        machineList = findViewById(R.id.machineList);
        adapter = new CustomAdapter(this, R.layout.machine_item, machines);
        machineList.setAdapter(adapter);

        addMachineButton = findViewById(R.id.addMachineButton);
        addMachineButton.setOnClickListener(this);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Machines");



        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Machine value = dataSnapshot.getValue(Machine.class);
                machines.add(value);
                adapter.notifyDataSetChanged();
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

    }

    @Override
    public void onClick(View v) {
        if (v == addMachineButton) {
            Intent i = new Intent(this, machineDetails.class);
            startActivity(i);
        }
    }

}
