package scenerio_based;

import java.util.*;

public class CourseRegistrationSystem {

    public static void main(String[] args) {

        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 45);
        courses.put("CS102", 10);
        courses.put("MATH201", 3);
        courses.put("PHY110", 52);
        courses.put("BIO150", 55);

        courses.put("CS101", courses.get("CS101") + 3);
        courses.put("MATH201", Math.max(0, courses.get("MATH201") - 2));

        System.out.println("Near Full (≥50):");
        for (Map.Entry<String, Integer> e : courses.entrySet())
            if (e.getValue() >= 50) System.out.println(e.getKey() + " → " + e.getValue());

        System.out.println("\nUnder-Subscribed (<5):");
        for (Map.Entry<String, Integer> e : courses.entrySet())
            if (e.getValue() < 5) System.out.println(e.getKey() + " → " + e.getValue());
    }
}