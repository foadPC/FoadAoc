package com.foad.user.foadaoc2019;

import android.widget.Button;

import java.io.Serializable;
import java.util.Date;

public class Machine implements Serializable {
private String MachineType;
private Date DateOfCreation;
private Date LastMaintenance;
private Date NextMaintenance;
private String MachineStatus;
private Button CreateMachine;
    public Machine() {

    }

    public Machine(String machineType, Date DateOfCreation, Date lastMaintenance, Date nextMaintenance, String MachineStatus) {
        this.MachineType = machineType;
        this.DateOfCreation = DateOfCreation;
        this.LastMaintenance = lastMaintenance;
        this.NextMaintenance = nextMaintenance;
        this.MachineStatus = MachineStatus;
    }

    public Date getNextMaintenance() {
        return NextMaintenance;
    }

    public void setNextMaintenance(Date nextMaintenance) {
        NextMaintenance = nextMaintenance;
    }

    public Date getLastMaintenance() {

        return LastMaintenance;
    }

    public void setLastMaintenance(Date lastMaintenance) {
        LastMaintenance = lastMaintenance;
    }

    public Date getDateOfCreation() {
        return DateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
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

