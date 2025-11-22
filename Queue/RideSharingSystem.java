package com.Queue;

import java.util.*;

public class RideSharingSystem {

    private Queue<RideRequest> normalQueue = new LinkedList<>();
    private PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>();
    private Set<Driver> availableDrivers = new HashSet<>();
    private List<Ride> rideHistory = new ArrayList<>();

    public void addRideRequest(RideRequest request) {
        normalQueue.add(request);
    }

    public void addPriorityRide(RideRequest request) {
        priorityQueue.add(request);
    }

    public void addDriver(Driver driver) {
        availableDrivers.add(driver);
    }

    private Driver assignDriver() {
        if (availableDrivers.isEmpty()) return null;
        return availableDrivers.iterator().next();
    }

    public void processRides() {

        System.out.println("\nProcessing Priority Rides:");
        while (!priorityQueue.isEmpty() && !availableDrivers.isEmpty()) {
            RideRequest req = priorityQueue.poll();
            Driver driver = assignDriver();
            availableDrivers.remove(driver);
            rideHistory.add(new Ride(req.getCustomerName(), driver));
            System.out.println("Assigned: " + req + " → " + driver);
        }

        System.out.println("\nProcessing Normal Rides:");
        while (!normalQueue.isEmpty() && !availableDrivers.isEmpty()) {
            RideRequest req = normalQueue.poll();
            Driver driver = assignDriver();
            availableDrivers.remove(driver);
            rideHistory.add(new Ride(req.getCustomerName(), driver));
            System.out.println("Assigned: " + req + " → " + driver);
        }
    }

    public void showRideHistory() {
        System.out.println("\nCompleted Rides:");
        for (Ride r : rideHistory) System.out.println(r);
    }
}