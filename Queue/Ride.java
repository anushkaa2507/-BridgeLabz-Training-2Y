package com.Queue;
public class Ride {

    private String customerName;
    private Driver driver;

    public Ride(String customerName, Driver driver) {
        this.customerName = customerName;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Ride: " + customerName + " with driver " + driver;
    }
}