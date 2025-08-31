import java.util.Random;

public class EmployeeBonus {

    
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); 
            int years = 1 + rand.nextInt(15);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

  
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int n = employeeData.length;
        double[][] result = new double[n][3]; 

        for (int i = 0; i < n; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus;

            if (years > 5) {
                bonus = oldSalary * 0.05; 
            } else {
                bonus = oldSalary * 0.02; 
            }

            double newSalary = oldSalary + bonus;
            result[i][0] = oldSalary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    
    public static void displayResults(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s %-12s%n", 
                          "EmpID", "OldSalary", "Years", "Bonus", "NewSalary", "CompanyAge");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int years = employeeData[i][1];
            double oldSalary = bonusData[i][0];
            double bonus = bonusData[i][1];
            double newSalary = bonusData[i][2];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-10d %-12.2f %-12d %-12.2f %-12.2f %-12d%n", 
                              (i + 1), oldSalary, years, bonus, newSalary, 10);
        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-12s %-12.2f %-12.2f %-12s%n",
                          "TOTAL", totalOldSalary, "-", totalBonus, totalNewSalary, "-");
    }

    public static void main(String[] args) {
        int n = 10; 
        int[][] employeeData = generateEmployeeData(n);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);

        displayResults(employeeData, bonusData);
    }
}
