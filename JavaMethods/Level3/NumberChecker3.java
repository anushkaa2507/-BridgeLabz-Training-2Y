import java.util.Arrays;

public class NumberChecker3 {

    
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

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

   
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

   
    public static void main(String[] args) {
        int number = 12021; 
        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));

        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));
        System.out.println("Arrays equal? " + compareArrays(digits, reversed));
        System.out.println("Is Palindrome? " + isPalindrome(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
    }
}
