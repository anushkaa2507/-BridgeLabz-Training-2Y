package com.Queue;

public class OrderMain {

    public static void main(String[] args) {

        OrderSystem system = new OrderSystem();

        system.addOrder(new Order("101", "Aarav", 1500));
        system.addOrder(new Order("102", "Meera", 2000));
        system.addOrder(new Order("101", "Aarav", 1500));
        system.addOrder(new Order("X500", "Rohan", 3000));
        system.addOrder(new Order("103", "Isha", 1800));

        system.removeDuplicates();
        system.loadQueue();
        system.processOrders();
        system.retryFailedOrders();
    }
}