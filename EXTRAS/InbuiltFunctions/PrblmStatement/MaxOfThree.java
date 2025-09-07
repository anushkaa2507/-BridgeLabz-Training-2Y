import java.util.Scanner;

public class MaxOfThree {
    static Scanner sc = new Scanner(System.in);

   
    public static int getInput(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        int num1 = getInput("Enter first number: ");
        int num2 = getInput("Enter second number: ");
        int num3 = getInput("Enter third number: ");

        int max = findMax(num1, num2, num3);

        System.out.println("Maximum of the three numbers: " + max);
    }
}
