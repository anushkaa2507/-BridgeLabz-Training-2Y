
class Employee {
   
    static String companyName = "Tech Solutions Pvt Ltd";

   
    private static int totalEmployees = 0;

    
    private final int id;

   
    private String name;
    private String designation;

    Employee(int id, String name, String designation) {
        this.id = id; 
        this.name = name;
        this.designation = designation;

        totalEmployees++; 
    }

   
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }


    public void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + emp.id);
            System.out.println("Name: " + emp.name);
            System.out.println("Designation: " + emp.designation);
            System.out.println("-------------------------");
        } else {
            System.out.println("The provided object is not an Employee.");
        }
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        
        Employee e1 = new Employee(101, "Alice", "Software Engineer");
        Employee e2 = new Employee(102, "Bob", "Manager");

    
        e1.displayDetails(e1);
        e2.displayDetails(e2);

        
        String notAnEmployee = "Hello";
        e1.displayDetails(notAnEmployee);

       
        Employee.displayTotalEmployees();
    }
}
