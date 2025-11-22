package scenerio_based;

import java.util.*;

public class ExamResults {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> subjects = new HashMap<>();

        Map<String, Integer> math = new HashMap<>();
        math.put("Alice", 88);
        math.put("Bob", 75);
        math.put("Charlie", 92);

        Map<String, Integer> science = new HashMap<>();
        science.put("Alice", 90);
        science.put("Bob", 85);
        science.put("Charlie", 80);

        Map<String, Integer> english = new HashMap<>();
        english.put("Alice", 78);
        english.put("Bob", 82);
        english.put("Charlie", 88);

        subjects.put("Math", math);
        subjects.put("Science", science);
        subjects.put("English", english);

        for (String sub : subjects.keySet()) {
            Map<String, Integer> m = subjects.get(sub);

            String topper = null;
            int max = -1;

            for (Map.Entry<String, Integer> e : m.entrySet()) {
                if (e.getValue() > max) {
                    max = e.getValue();
                    topper = e.getKey();
                }
            }
            System.out.println(sub + " Topper: " + topper + " (" + max + ")");
        }

        System.out.println("\nAverage per Subject:");
        for (String sub : subjects.keySet()) {
            Map<String, Integer> m = subjects.get(sub);
            double avg = m.values().stream().mapToInt(v -> v).average().orElse(0);
            System.out.println(sub + " → " + avg);
        }
    }
}