import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            
            double r1 = a + b * c;   // * before +
            double r2 = a * b + c;   // * before +
            double r3 = c + a / b;   // / before +
            double r4 = a % b + c;   // % before +
            
            System.out.println("The results of Double Operations are " +
                    r1 + ", " + r2 + ", " + r3 + ", and " + r4);
        }
    }
}