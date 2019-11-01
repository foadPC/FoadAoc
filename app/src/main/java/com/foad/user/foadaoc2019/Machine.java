package com.foad.user.foadaoc2019;

import java.io.Serializable;
import java.util.Date;

public class Machine implements Serializable {
private String MachineName;
private Date date;
private Date LastMaintenance;
private Date NextMaintenance;

    public Machine() {

    }

    public Machine(String machineName, Date date, Date lastMaintenance, Date nextMaintenance) {
        this.MachineName = machineName;
        this.date = date;
        this.LastMaintenance = lastMaintenance;
        this.NextMaintenance = nextMaintenance;
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

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMachineName() {

        return MachineName;
    }

    public void setMachineName(String machineName) {
        MachineName = machineName;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "MachineName='" + MachineName + '\'' +
                ", date=" + date +
                ", LastMaintenance=" + LastMaintenance +
                ", NextMaintenance=" + NextMaintenance +
                '}';
    }
}

