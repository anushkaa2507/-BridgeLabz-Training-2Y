package com.Queue;

import java.util.*;

public class OrderSystem {

    private List<Order> allOrders = new ArrayList<>();
    private Set<Order> uniqueOrders = new HashSet<>();
    private Queue<Order> processingQueue = new LinkedList<>();
    private Stack<Order> failedOrders = new Stack<>();

    public void addOrder(Order order) {
        allOrders.add(order);
    }

    public void removeDuplicates() {
        uniqueOrders.addAll(allOrders);
    }

    public void loadQueue() {
        processingQueue.addAll(uniqueOrders);
    }

    public void processOrders() {
        System.out.println("\nProcessing Orders:");
        while (!processingQueue.isEmpty()) {
            Order order = processingQueue.remove();
            System.out.println("Processing: " + order);

            if (order.getOrderId().contains("X")) {
                System.out.println("Order Failed → Sending to Failed Stack");
                failedOrders.push(order);
            }
        }
    }

    public void retryFailedOrders() {
        System.out.println("\nRetrying Failed Orders:");
        while (!failedOrders.isEmpty()) {
            Order order = failedOrders.pop();
            System.out.println("Retry: " + order);
        }
    }
}