package scenerio_based;

import java.util.*;

public class EmployeeSalaryDirectory {

    public static void main(String[] args) {

        Map<String, Double> salary = new HashMap<>();

        salary.put("Alice", 50000.0);
        salary.put("Bob", 60000.0);
        salary.put("Charlie", 70000.0);
        salary.put("David", 55000.0);
        salary.put("Eve", 80000.0);
        salary.put("Frank", 65000.0);

        salary.put("Bob", salary.get("Bob") * 1.10);
        salary.put("Eve", salary.get("Eve") * 1.05);

        double avg = salary.values().stream().mapToDouble(v -> v).average().orElse(0);
        System.out.println("Average Salary: " + avg);

        double max = salary.values().stream().mapToDouble(v -> v).max().orElse(0);

        System.out.println("Highest Paid:");
        for (Map.Entry<String, Double> e : salary.entrySet())
            if (e.getValue() == max) System.out.println(e.getKey() + " → " + e.getValue());
    }
}