import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;  
        int[] digits = new int[maxDigit];
        int index = 0;

       
        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;

            if (index == maxDigit) {
                System.out.println("Maximum digits (" + maxDigit + ") reached. Remaining digits ignored.");
                break;
            }
            number = number / 10;
        }

     
        int largest = -1, secondLargest = -1;

       
        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        
        System.out.println("\nDigits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nLargest digit = " + largest);

        if (secondLargest != -1) {
            System.out.println("Second largest digit = " + secondLargest);
        } else {
            System.out.println("Second largest digit does not exist (all digits are same).");
        }

        sc.close();
    }
}
