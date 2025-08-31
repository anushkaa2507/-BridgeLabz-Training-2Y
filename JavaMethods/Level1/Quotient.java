import java.util.Scanner;

public class Quotient {

  
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; 
        result[0] = number / divisor;
        result[1] = number % divisor;  
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero!");
        } else {
           
            int[] result = findRemainderAndQuotient(number, divisor);

            System.out.println("Quotient = " + result[0]);
            System.out.println("Remainder = " + result[1]);
        }

        sc.close();
    }
}
