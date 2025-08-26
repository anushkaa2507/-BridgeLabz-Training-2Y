import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double number1 = in.nextDouble();
            double number2 = in.nextDouble();
            
            double add = number1 + number2;
            double sub = number1 - number2;
            double mul = number1 * number2;
            double div = (number2 != 0) ? number1 / number2 : Double.NaN;
            
            System.out.println(
                    "The addition, subtraction, multiplication and division value of 2 numbers " +
                            number1 + " and " + number2 + " is " +
                            add + ", " + sub + ", " + mul + ", and " + div
            );
        }
    }
}