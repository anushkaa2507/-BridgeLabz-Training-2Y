package com.Queue;

public class Driver {

    private String driverId;
    private String name;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    public String getDriverId() {
        return driverId;
    }

    @Override
    public int hashCode() {
        return driverId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Driver d = (Driver) obj;
        return this.driverId.equals(d.driverId);
    }

    @Override
    public String toString() {
        return name + " (" + driverId + ")";
    }
}