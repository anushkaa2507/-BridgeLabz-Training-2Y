
class Employee {
    public int employeeID;    
    protected String department;  
    private double salary;       


    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

   
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

   
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID +
                           ", Department: " + department +
                           ", Salary: " + salary);
    }
}


class Manager extends Employee {
    String teamName;

    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID +
                           ", Department: " + department +
                           ", Team: " + teamName);
    }
}


public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 40000);
        e1.displayEmployee();

        e1.setSalary(45000);
        System.out.println("Updated Salary: " + e1.getSalary());

        Manager m1 = new Manager(201, "IT", 70000, "DevOps");
        m1.displayEmployee();       
        m1.displayManagerDetails(); 
    }
}
