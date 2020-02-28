package com.foad.user.foadaoc2019;

import android.widget.Button;

import java.io.Serializable;
import java.util.Date;

public class Machine implements Serializable {
private String MachineType;
private String DateOfCreation;
private String LastMaintenance;
private String NextMaintenance;
private String MachineStatus;
private Button CreateMachine;

    public Machine() {

    }

    public Machine(String machineType, String DateOfCreation, String lastMaintenance, String nextMaintenance, String MachineStatus) {
        this.MachineType = machineType;
        this.DateOfCreation = DateOfCreation;
        this.LastMaintenance = lastMaintenance;
        this.NextMaintenance = nextMaintenance;
        this.MachineStatus = MachineStatus;
    }

    public String getNextMaintenance() {
        return NextMaintenance;
    }

    public void setNextMaintenance(String nextMaintenance) {
        NextMaintenance = nextMaintenance;
    }

    public String getLastMaintenance() {

        return LastMaintenance;
    }

    public void setLastMaintenance(String lastMaintenance) {
        LastMaintenance = lastMaintenance;
    }

    public String getDateOfCreation() {
        return DateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        DateOfCreation = dateOfCreation;
    }

    public String getMachineName() {

        return MachineType;
    }

    public void setMachineType(String machineType) {
        MachineType = machineType;
    }

    public String getMachineStatus() {
        return MachineStatus;
    }

    public void setMachineStatus(String machineStatus) {
        MachineStatus = machineStatus;
    }

    public Button getCreateMachine() {
        return CreateMachine;
    }

    public void setCreateMachine(Button createMachine) {
        CreateMachine = createMachine;
    }



    @Override
    public String toString() {
        return "Machine{" +
                "MachineType='" + MachineType + '\'' +
                ", date=" + DateOfCreation +
                ", LastMaintenance=" + LastMaintenance +
                ", NextMaintenance=" + NextMaintenance +
                ", MachineStatus=" + MachineStatus +
                '}';
    }
}

