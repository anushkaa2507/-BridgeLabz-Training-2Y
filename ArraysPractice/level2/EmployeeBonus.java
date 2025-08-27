import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMPLOYEES = 10;

   
        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

          
            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0) {
                System.out.println("Invalid Salary! Try again.");
                i--; 
                continue;
            }

            
            System.out.print("Enter Years of Service: ");
            double yrs = sc.nextDouble();
            if (yrs < 0) {
                System.out.println("Invalid Years of Service! Try again.");
                i--; 
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];

            
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

  
        System.out.println("\n--- Employee Bonus Report ---");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                    ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary of all employees: " + totalOldSalary);
        System.out.println("Total Bonus payout by Zara: " + totalBonus);
        System.out.println("Total New Salary of all employees: " + totalNewSalary);

        sc.close();
    }
}
