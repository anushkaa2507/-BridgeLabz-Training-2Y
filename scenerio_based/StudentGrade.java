package scenerio_based;
import java.util.*;

public class StudentGrade {

    public static void main(String[] args) {

        Map<String, Double> grades = new HashMap<>();

        grades.put("Alice", 85.5);
        grades.put("Bob", 72.0);
        grades.put("Charlie", 91.0);
        grades.put("David", 60.5);

        grades.put("Bob", 78.0);

        grades.remove("David");

        System.out.println("Student Grades (Alphabetical):");

        grades.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}