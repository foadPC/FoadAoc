package com.foad.user.foadaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class MachineListActivity extends AppCompatActivity implements View.OnClickListener {

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

    }

    @Override
    public void onClick(View v) {
        if (v == addMachineButton) {
            Intent i = new Intent(this, machineDetails.class);
            startActivity(i);
        }
    }
}
