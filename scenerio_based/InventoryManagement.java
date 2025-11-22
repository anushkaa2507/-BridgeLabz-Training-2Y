package scenerio_based;
import java.util.*;

public class InventoryManagement {

    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();

        stock.put("Laptop", 10);
        stock.put("Mouse", 25);
        stock.put("Keyboard", 15);
        stock.put("Monitor", 5);

        stock.put("Laptop", stock.get("Laptop") - 3);
        if (stock.get("Laptop") <= 0) stock.put("Laptop", 0);

        stock.put("Mouse", stock.get("Mouse") - 25);
        if (stock.get("Mouse") <= 0) stock.put("Mouse", 0);

        stock.put("Keyboard", stock.get("Keyboard") + 10);

        String product = "Monitor";
        if (stock.containsKey(product))
            System.out.println(product + " remaining: " + stock.get(product));
        else
            System.out.println("Not stocked");

        System.out.println("\nOut of stock products:");
        for (Map.Entry<String, Integer> e : stock.entrySet()) {
            if (e.getValue() == 0)
                System.out.println(e.getKey());
        }
    }
}