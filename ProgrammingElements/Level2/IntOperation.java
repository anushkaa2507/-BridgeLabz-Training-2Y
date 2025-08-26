import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            
            int r1 = a + b * c;   // * before +
            int r2 = a * b + c;   // * before +
            int r3 = c + a / b;   // / before +
            int r4 = a % b + c;   // % before +
            
            System.out.println("The results of Int Operations are " +
                    r1 + ", " + r2 + ", " + r3 + ", and " + r4);
        }
    }
}