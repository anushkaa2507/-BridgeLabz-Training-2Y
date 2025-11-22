package com.Queue;

import java.util.*;

class Product {
    String name;
    int price;
    int stock;

    Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return name + " | Price: " + price + " | Stock: " + stock;
    }
}

public class InventorySystem {
    public static void main(String[] args) {

        Set<String> productNames = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restockHistory = new Stack<>();

        addProduct("Apple", 50, 2, productNames, products);
        addProduct("Banana", 20, 10, productNames, products);
        addProduct("Milk", 40, 1, productNames, products);
        addProduct("Apple", 50, 5, productNames, products);

        for (Product p : products) {
            if (p.stock < 3) {
                restockQueue.add(p);
            }
        }

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 5;
            restockHistory.push(p);
        }

        if (!restockHistory.isEmpty()) {
            Product last = restockHistory.pop();
            last.stock -= 5;
        }

        System.out.println("Products:");
        for (Product p : products) System.out.println(p);

        System.out.println("Restock history:");
        System.out.println(restockHistory);
    }

    static void addProduct(String name, int price, int stock, Set<String> names, List<Product> list) {
        if (!names.contains(name)) {
            names.add(name);
            list.add(new Product(name, price, stock));
        }
    }
}