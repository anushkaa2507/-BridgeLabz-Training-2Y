package scenerio_based;

import java.util.*;

public class EmployeeDepartment{

    public static void main(String[] args) {

        Map<Integer, String> emp = new HashMap<>();

        emp.put(101, "HR");
        emp.put(102, "IT");
        emp.put(103, "Finance");
        emp.put(104, "IT");
        emp.put(105, "HR");

        emp.put(104, "Finance");

        String targetDept = "IT";
        System.out.println("Employees in " + targetDept + ":");
        for (Map.Entry<Integer, String> e : emp.entrySet())
            if (e.getValue().equals(targetDept))
                System.out.println(e.getKey());

        Map<String, Integer> count = new HashMap<>();
        for (String dept : emp.values())
            count.put(dept, count.getOrDefault(dept, 0) + 1);

        System.out.println("\nEmployees per Department:");
        for (Map.Entry<String, Integer> e : count.entrySet())
            System.out.println(e.getKey() + " → " + e.getValue());
    }
}