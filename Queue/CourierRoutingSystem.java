package com.Queue;
import java.util.*;

class Parcel implements Comparable<Parcel> {
    String id;
    String address;
    int priority;

    Parcel(String id, String address, int priority) {
        this.id = id;
        this.address = address;
        this.priority = priority;
    }

    public int compareTo(Parcel p) {
        return p.priority - this.priority;
    }

    public String toString() {
        return id + " -> " + address + " (Priority: " + priority + ")";
    }
}

public class CourierRoutingSystem {
    public static void main(String[] args) {

        PriorityQueue<Parcel> priorityDeliveries = new PriorityQueue<>();
        Set<String> assignedIds = new HashSet<>();
        List<Parcel> completedDeliveries = new ArrayList<>();
        Queue<Parcel> normalQueue = new LinkedList<>();

        addParcel("D1", "Delhi", 5, priorityDeliveries, normalQueue, assignedIds);
        addParcel("D2", "Mumbai", 2, priorityDeliveries, normalQueue, assignedIds);
        addParcel("D3", "Chennai", 4, priorityDeliveries, normalQueue, assignedIds);
        addParcel("D2", "Duplicate", 3, priorityDeliveries, normalQueue, assignedIds);

        while (!priorityDeliveries.isEmpty()) {
            completedDeliveries.add(priorityDeliveries.poll());
        }

        while (!normalQueue.isEmpty()) {
            completedDeliveries.add(normalQueue.poll());
        }

        System.out.println("Assigned IDs:");
        System.out.println(assignedIds);

        System.out.println("\nCompleted Deliveries:");
        for (Parcel p : completedDeliveries) System.out.println(p);
    }

    static void addParcel(String id, String address, int priority,
                          PriorityQueue<Parcel> pq, Queue<Parcel> q, Set<String> ids) {

        if (!ids.contains(id)) {
            ids.add(id);
            Parcel p = new Parcel(id, address, priority);
            if (priority > 3) pq.add(p);
            else q.add(p);
        }
    }
}