package com.Queue;

import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalSystem {
    public static void main(String[] args) {

        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> waitingQueue = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        admit("John", 3, admitted, waitingQueue, history);
        admit("Alice", 5, admitted, waitingQueue, history);
        admit("Bob", 2, admitted, waitingQueue, history);
        admit("Alice", 5, admitted, waitingQueue, history);

        while (!waitingQueue.isEmpty()) {
            Patient p = waitingQueue.poll();
            discharged.push(p);
        }

        if (!discharged.isEmpty()) {
            Patient p = discharged.pop();
            waitingQueue.add(p);
        }

        System.out.println("Admitted:");
        for (Patient p : admitted) System.out.println(p);

        System.out.println("\nWaiting Queue:");
        for (Patient p : waitingQueue) System.out.println(p);

        System.out.println("\nDischarged:");
        for (Patient p : discharged) System.out.println(p);

        System.out.println("\nHistory:");
        for (Patient p : history) System.out.println(p);
    }

    static void admit(String name, int severity, Set<Patient> admitted, Queue<Patient> q, List<Patient> history) {
        Patient p = new Patient(name, severity);
        if (!admitted.contains(p)) {
            admitted.add(p);
            q.add(p);
            history.add(p);
        }
    }
}