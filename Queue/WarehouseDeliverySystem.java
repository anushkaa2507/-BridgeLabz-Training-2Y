package com.Queue;

import java.util.*;

class PackageData {
    String id;
    String address;

    PackageData(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public String toString() {
        return id + " -> " + address;
    }
}

public class WarehouseDeliverySystem {
    public static void main(String[] args) {

        Queue<PackageData> pending = new LinkedList<>();
        Set<String> packageIds = new HashSet<>();
        List<PackageData> delivered = new ArrayList<>();
        Stack<PackageData> returned = new Stack<>();

        addPackage("P1", "Delhi", pending, packageIds);
        addPackage("P2", "Mumbai", pending, packageIds);
        addPackage("P3", "Kolkata", pending, packageIds);
        addPackage("P2", "Duplicate", pending, packageIds);

        while (!pending.isEmpty()) {
            PackageData p = pending.poll();
            if (p.id.equals("P3")) {
                returned.push(p);
            } else {
                delivered.add(p);
            }
        }

        System.out.println("Delivered:");
        for (PackageData p : delivered) System.out.println(p);

        System.out.println("\nReturned:");
        for (PackageData p : returned) System.out.println(p);

        System.out.println("\nAll IDs:");
        System.out.println(packageIds);
    }

    static void addPackage(String id, String address, Queue<PackageData> q, Set<String> ids) {
        if (!ids.contains(id)) {
            ids.add(id);
            q.add(new PackageData(id, address));
        }
    }
}