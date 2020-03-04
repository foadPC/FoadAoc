package com.foad.user.foadaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Date;

public class MachineListActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "FIREBASE";
    ListView machineList;
    Button addMachineButton;
    ArrayList<Machine> machines = new ArrayList<>();
    CustomAdapter adapter;


    @Override
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
