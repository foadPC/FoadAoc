package com.foad.user.foadaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class MachineListActivity extends AppCompatActivity {

    ListView machineList;
    Button addMachineButton;
    ArrayList<Machine> machines = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_list);

        machineList = findViewById(R.id.machineList);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, machines);

        machines.add(new Machine("machine 1",new Date(), new Date(), new Date()) );
        machines.add(new Machine("machine 2",new Date(), new Date(), new Date()) );
        machines.add(new Machine("machine 3",new Date(), new Date(), new Date()) );


    }
}
