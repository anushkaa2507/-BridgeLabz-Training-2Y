import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;                 
        int originalNumber = number; 

        
        number = Math.abs(number);

        
        while (number != 0) {
            int digit = number % 10; 
            
            sum += digit;            
            number /= 10;            
        }

        
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
