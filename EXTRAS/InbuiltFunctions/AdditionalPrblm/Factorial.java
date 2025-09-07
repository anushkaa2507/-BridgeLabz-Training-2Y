import java.util.Scanner;

public class Factorial {
    static Scanner sc = new Scanner(System.in);

    
    public static int getInput() {
        System.out.print("Enter a non-negative number: ");
        return sc.nextInt();
    }

    
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    
    public static void displayResult(int n, long fact) {
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    public static void main(String[] args) {
        int number = getInput();
        long fact = factorial(number);
        displayResult(number, fact);
        sc.close();
    }
}
