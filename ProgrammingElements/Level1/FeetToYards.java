import java.util.Scanner;

public class FeetToYards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");

        if (sc.hasNextDouble()) {
            double feet = sc.nextDouble();
            double yards = feet / 3; // 1 yard = 3 feet
            System.out.println(feet + " feet is equal to " + yards + " yards.");
        } else {
            System.out.println("Invalid input! Please enter a numeric value.");
        }

        sc.close();
    }
}
