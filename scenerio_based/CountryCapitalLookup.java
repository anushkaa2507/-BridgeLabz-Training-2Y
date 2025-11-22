package scenerio_based;

import java.util.*;

public class CountryCapitalLookup {

    public static void main(String[] args) {

        Map<String, String> capitals = new HashMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Canada", "Ottawa");
        capitals.put("Brazil", "Brasilia");

        String country = "Japan";
        if (capitals.containsKey(country))
            System.out.println(country + " → " + capitals.get(country));
        else
            System.out.println("Unknown country");

        System.out.println("\nAll Countries Alphabetically:");
        capitals.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}