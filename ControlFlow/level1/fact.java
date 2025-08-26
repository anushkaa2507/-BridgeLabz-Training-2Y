import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

       
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; 
            int counter = 1;

           
            while (counter <= number) {
                factorial *= counter;
                counter++;
            }

           
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        sc.close();
    }
}
