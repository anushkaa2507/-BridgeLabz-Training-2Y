package scenerio_based;
import java.util.*;

public class StudentAttendanceT {

    public static void main(String[] args) {

        Map<String, Integer> attendance = new HashMap<>();

        attendance.put("Alice", 0);
        attendance.put("Bob", 0);
        attendance.put("Charlie", 0);
        attendance.put("David", 0);
        attendance.put("Eve", 0);

        List<List<String>> days = Arrays.asList(
            Arrays.asList("Alice", "Bob"),
            Arrays.asList("Alice", "Charlie", "Eve"),
            Arrays.asList("Bob", "David"),
            Arrays.asList("Alice", "Eve"),
            Arrays.asList("Charlie", "David"),
            Arrays.asList("Alice"),
            Arrays.asList("Alice", "Bob", "Charlie"),
            Arrays.asList("Eve"),
            Arrays.asList("David", "Charlie"),
            Arrays.asList("Alice", "Eve"),
            Arrays.asList("Bob"),
            Arrays.asList("Charlie", "Eve"),
            Arrays.asList("Alice", "David"),
            Arrays.asList("Charlie"),
            Arrays.asList("Alice", "Bob")
        );

        for (List<String> day : days) {
            for (String student : day) {
                attendance.put(student, attendance.get(student) + 1);
            }
        }

        System.out.println("Under-attending Students (<10 days):");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            if (e.getValue() < 10)
                System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}