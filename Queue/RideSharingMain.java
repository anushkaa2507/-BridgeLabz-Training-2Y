package com.Queue;

public class RideSharingMain {

    public static void main(String[] args) {

        RideSharingSystem app = new RideSharingSystem();

        app.addDriver(new Driver("D1", "Arun"));
        app.addDriver(new Driver("D2", "Priya"));
        app.addDriver(new Driver("D3", "Karan"));

        app.addRideRequest(new RideRequest("Ravi", 1));
        app.addRideRequest(new RideRequest("Sneha", 2));

        app.addPriorityRide(new RideRequest("VIP-Anil", 5));
        app.addPriorityRide(new RideRequest("VIP-Neha", 4));

        app.processRides();
        app.showRideHistory();
    }
}