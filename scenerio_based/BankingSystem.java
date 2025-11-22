package scenerio_based;

import java.util.*;

public class BankingSystem {

    public static void main(String[] args) {

        Map<String, Double> accounts = new HashMap<>();

        accounts.put("ACC1001", 5000.0);
        accounts.put("ACC1002", 12000.0);
        accounts.put("ACC1003", 8000.0);
        accounts.put("ACC1004", 3000.0);
        accounts.put("ACC1005", 15000.0);

        accounts.put("ACC1001", accounts.get("ACC1001") + 2000);
        if (accounts.get("ACC1003") >= 9000)
            accounts.put("ACC1003", accounts.get("ACC1003") - 9000);

        System.out.println("Accounts Sorted by Balance Desc:");
        accounts.entrySet().stream()
            .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
            .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        System.out.println("\nTop 3 Customers:");
        accounts.entrySet().stream()
            .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
            .limit(3)
            .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}