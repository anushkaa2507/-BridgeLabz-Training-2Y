import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            
            double w;
            do {
                System.out.print("Weight (kg): ");
                w = sc.nextDouble();
                if (w <= 0) {
                    System.out.println("Weight must be positive! Try again.");
                }
            } while (w <= 0);

            
            double h;
            do {
                System.out.print("Height (m): ");
                h = sc.nextDouble();
                if (h <= 0) {
                    System.out.println("Height must be positive! Try again.");
                }
            } while (h <= 0);

            personData[i][0] = w;
            personData[i][1] = h;

            
            double bmi = w / (h * h);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

       
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("  Weight = " + personData[i][0] + " kg");
            System.out.println("  Height = " + personData[i][1] + " m");
            System.out.printf("  BMI = %.2f\n", personData[i][2]);
            System.out.println("  Status = " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}
