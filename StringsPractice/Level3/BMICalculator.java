import java.util.Scanner;

public class BMICalculator {

    public static String[][] calculateBMI(double[][] data) {
        int n = data.length;
        String[][] results = new String[n][4];

        for (int i = 0; i < n; i++) {
            double weight = data[i][0]; 
            double heightCm = data[i][1]; 
            double heightM = heightCm / 100; 

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            // Store results
            results[i][0] = String.valueOf(heightCm);
            results[i][1] = String.valueOf(weight);
            results[i][2] = String.valueOf(bmi);
            results[i][3] = status;
        }
        return results;
    }

    // Method to display results in tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-8s %-10s %-10s %-12s %-12s%n",
                "Person", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-8d %-10s %-10s %-12s %-12s%n",
                    (i + 1), results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; 

        double[][] data = new double[n][2]; 

        
        System.out.println("Enter weight (kg) and height (cm) for 10 team members:");
        for (int i = 0; i < n; i++) {
            System.out.print("Member " + (i + 1) + " Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Member " + (i + 1) + " Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        
        String[][] results = calculateBMI(data);

        
        displayResults(results);

        sc.close();
    }
}
