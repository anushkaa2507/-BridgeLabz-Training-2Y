import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;               
        int originalNumber = number;  

       
        number = Math.abs(number);

       
        if (number == 0) {
            count = 1; 
        } else {
            while (number != 0) {
                number /= 10; 
                count++;      
            }
        }

        
        System.out.println("The number " + originalNumber + " has " + count + " digits.");

        sc.close();
    }
}
