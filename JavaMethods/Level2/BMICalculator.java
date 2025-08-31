import java.util.Scanner;

public class BMICalculator {

  
    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100.0;
        return weight / (heightMeters * heightMeters);
    }

    
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] members = new double[10][3]; 
        String[] status = new String[10];

        System.out.println("Enter weight (kg) and height (cm) for 10 members:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " - Weight (kg): ");
            double weight = sc.nextDouble();
            System.out.print("Member " + (i + 1) + " - Height (cm): ");
            double height = sc.nextDouble();

            double bmi = calculateBMI(weight, height);

            members[i][0] = weight;
            members[i][1] = height;
            members[i][2] = bmi;

            status[i] = getBMIStatus(bmi);
        }

        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    members[i][0], members[i][1], members[i][2], status[i]);
        }

        sc.close();
    }
}
