package scenerio_based;
import java.util.*;

public class WebsiteVisitTracker {

    public static void main(String[] args) {

        Map<String, Integer> visits = new HashMap<>();

        String[] pages = {
            "home", "about", "products", "home", "products",
            "contact", "home", "products", "home"
        };

        for (String p : pages)
            visits.put(p, visits.getOrDefault(p, 0) + 1);

        System.out.println("Visit Count (Descending):");
        visits.entrySet()
              .stream()
              .sorted((a, b) -> b.getValue() - a.getValue())
              .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        String mostVisited = Collections.max(visits.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nMost Visited: " + mostVisited);
    }
}