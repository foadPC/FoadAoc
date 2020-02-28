package com.foad.user.foadaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class machineDetails extends AppCompatActivity implements View.OnClickListener{
Button CreateMachine;
TextView MachineType,DateOfCreation,LastMaintenance,NextMaintenance,MachineStatus;
EditText InsertMachineType, InsertDateOfCreation,InsertLastMaintenance,InsertNextMaintenance,InsertMachineStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_details);

        //Button
        CreateMachine = findViewById(R.id.CreateMachine);
        CreateMachine.setOnClickListener(this);

        //textView
        MachineType = findViewById(R.id.MachineType);
        DateOfCreation = findViewById(R.id.DateOfCreation);
        LastMaintenance = findViewById(R.id.LastMaintenance);
        NextMaintenance = findViewById(R.id.NextMaintenance);
        MachineStatus = findViewById(R.id.MachineStatus);

        //EditText
        InsertMachineType = findViewById(R.id.InsertMachineType);
        InsertDateOfCreation = findViewById(R.id.InsertDateOfCreation);
        InsertLastMaintenance = findViewById(R.id.InsertMachineType);
        InsertNextMaintenance = findViewById(R.id.InsertNextMaintenance);
        InsertMachineStatus = findViewById(R.id.InsertMachineStatus);

    }
    public void onClick(View v){
        if (v == CreateMachine){
            addToFireBase(new Machine(MachineType.getText().toString(),DateOfCreation.getText().toString(),LastMaintenance.getText().toString(),NextMaintenance.getText().toString(),MachineStatus.getText().toString()) );
            Intent i = new Intent(this, MachineListActivity.class);
            startActivity(i);
        }
    }
    public void addToFireBase(Machine machine){



    }
}

