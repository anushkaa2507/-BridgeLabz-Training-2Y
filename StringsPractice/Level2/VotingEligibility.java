import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; 
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false"; 
            } else if (age >= 18) {
                result[i][1] = "true"; 
            } else {
                result[i][1] = "false"; 
            }
        }
        return result;
    }


    public static void displayResult(String[][] arr) {
        System.out.printf("%-10s%-15s%n", "Age", "Can Vote?");
        System.out.println("-------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s%-15s%n", arr[i][0], arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        
        int[] ages = generateAges(n);

   
        String[][] result = checkVotingEligibility(ages);

        
        displayResult(result);

        sc.close();
    }
}
