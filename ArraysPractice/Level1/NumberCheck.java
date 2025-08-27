import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] numbers = new int[5];

       
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("Number " + numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is Positive and Odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("Number " + numbers[i] + " is Negative.");
            } else {
                System.out.println("Number " + numbers[i] + " is Zero.");
            }
        }

        System.out.println("\nComparison of First and Last Element:");
        if (numbers[0] == numbers[4]) {
            System.out.println("First element (" + numbers[0] + ") is equal to Last element (" + numbers[4] + ").");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element (" + numbers[0] + ") is greater than Last element (" + numbers[4] + ").");
        } else {
            System.out.println("First element (" + numbers[0] + ") is less than Last element (" + numbers[4] + ").");
        }

        sc.close();
    }
}
