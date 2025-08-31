import java.util.Scanner;

public class NumberChecker {

    
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

   
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        
        System.out.println("\n--- Results ---");
        for (int num : numbers) {
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }

      
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of first and last element: ");
        if (result == 1) {
            System.out.println(numbers[0] + " is Greater than " + numbers[numbers.length - 1]);
        } else if (result == 0) {
            System.out.println(numbers[0] + " is Equal to " + numbers[numbers.length - 1]);
        } else {
            System.out.println(numbers[0] + " is Less than " + numbers[numbers.length - 1]);
        }

        sc.close();
    }
}
