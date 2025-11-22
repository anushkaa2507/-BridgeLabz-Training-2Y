package com.Queue;

public class RideRequest implements Comparable<RideRequest> {

    private String customerName;
    private int priority;

    public RideRequest(String customerName, int priority) {
        this.customerName = customerName;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public int compareTo(RideRequest o) {
        return o.priority - this.priority;
    }

    @Override
    public String toString() {
        return customerName + " (Priority: " + priority + ")";
    }
}