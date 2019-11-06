package com.foad.user.foadaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MachineListActivity extends AppCompatActivity {

    ListView machineList;
    Button addMachineButton;
    ArrayList<Machine> machines = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_list);

        machines.add(new Machine());
    }
}
