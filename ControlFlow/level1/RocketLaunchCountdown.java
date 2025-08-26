import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();

        
        while (counter >= 1) {
            System.out.println(counter);
            counter--;  
        }

        
        System.out.println("Lift Off! 🚀");

        sc.close();
    }
}
