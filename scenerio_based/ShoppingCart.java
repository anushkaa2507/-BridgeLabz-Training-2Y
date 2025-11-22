package scenerio_based;

import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        Map<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 40000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);
        cart.put("Bag", 800.0);

        System.out.println("Items in Order Added:");
        for (Map.Entry<String, Double> e : cart.entrySet())
            System.out.println(e.getKey() + " → " + e.getValue());

        double total = 0;
        for (double price : cart.values()) total += price;

        if (total > 5000) total *= 0.9;

        System.out.println("\nTotal Payable: " + total);

        cart.remove("Mouse");

        System.out.println("\nFinal Cart:");
        for (Map.Entry<String, Double> e : cart.entrySet())
            System.out.println(e.getKey() + " → " + e.getValue());
    }
}