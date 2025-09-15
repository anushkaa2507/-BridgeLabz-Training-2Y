
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}


abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

   
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

   
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }


    public abstract double calculateSalary();

   
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
        System.out.println(getDepartmentDetails());
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}


class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Anu", 50000, 10000);
        Employee e2 = new PartTimeEmployee(102, "hehe", 20000, 80, 200);

        e1.assignDepartment("HR");
        e2.assignDepartment("Development");

        
        Employee[] employees = {e1, e2};

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("---------------------------");
        }
    }
}
