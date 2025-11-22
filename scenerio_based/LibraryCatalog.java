package scenerio_based;

import java.util.*;

public class LibraryCatalog {

    public static void main(String[] args) {

        Map<String, String> books = new HashMap<>();

        books.put("978-1111111111", "Java Basics");
        books.put("978-2222222222", "Data Structures");
        books.put("978-3333333333", "Algorithms Guide");
        books.put("978-4444444444", "Database Systems");

        String isbn = "978-2222222222";
        if (books.containsKey(isbn))
            System.out.println("Found: " + books.get(isbn));
        else
            System.out.println("Book not found");

        books.remove("978-4444444444");

        System.out.println("\nBooks Sorted by ISBN:");
        books.entrySet()
             .stream()
             .sorted(Map.Entry.comparingByKey())
             .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        String searchTitle = "Java Basics";
        boolean found = false;
        for (Map.Entry<String, String> e : books.entrySet()) {
            if (e.getValue().equalsIgnoreCase(searchTitle)) {
                System.out.println("\nTitle found at ISBN: " + e.getKey());
                found = true;
            }
        }
        if (!found) System.out.println("\nTitle not found");
    }
}