import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double a = in.nextDouble();   
            double b = in.nextDouble();  
            
            double add = a + b;
            double sub = a - b;
            double mul = a * b;
            double div = (b != 0) ? a / b : Double.NaN;
            
            System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
                    a + " and " + b + " is " + add + ", " + sub + ", " + mul + ", and " + div);
        } 
    }
}