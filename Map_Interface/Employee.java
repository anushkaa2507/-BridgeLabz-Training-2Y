package Map_Interface;



public class Employee {
    private String name;
    private String department;

    public Employee(String n, String d) {
        this.name = n;
        this.department = d;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return name;
    }
}