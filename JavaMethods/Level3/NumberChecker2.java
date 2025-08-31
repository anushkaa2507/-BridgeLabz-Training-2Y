import java.util.Arrays;

public class NumberChecker2 {

    
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

   
    public static int[] getDigitsArray(int number) {
        String str = String.valueOf(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

   
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; 
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;  
            freq[i][1] = 0;  
        }

        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

   
    public static void main(String[] args) {
        int number = 378; 
        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number? " + isHarshadNumber(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1] + " times");
            }
        }
    }
}
