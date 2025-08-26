import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int number1 = in.nextInt();
            int number2 = in.nextInt();
            
            int quotient = number1 / number2;     // division
            int remainder = number1 % number2;    // modulus
            
            System.out.println("The Quotient is " + quotient +
                    " and Remainder is " + remainder +
                    " of two number " + number1 + " and " + number2);
        }
    }
}