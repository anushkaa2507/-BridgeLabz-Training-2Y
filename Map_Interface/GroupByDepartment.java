package Map_Interface;


import java.util.*;

public class GroupByDepartment {
    public static Map<String, List<Employee>> group(List<Employee> employees) {
        Map<String, List<Employee>> grouped = new HashMap<>();
        for (Employee e : employees) {
            grouped.computeIfAbsent(e.getDepartment(), d -> new ArrayList<>()).add(e);
        }
        return grouped;
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", "HR"));
        list.add(new Employee("Bob", "IT"));
        list.add(new Employee("Carol", "HR"));

        Map<String, List<Employee>> result = group(list);

        for (String dept : result.keySet()) {
            System.out.println(dept + ": " + result.get(dept));
        }
    }
}