import java.util.Scanner;

public class Palindrome {

    
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

   
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    
    public static boolean isPalindromeCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] reversed = new char[len];
        for (int i = 0; i < len; i++) {
            reversed[i] = text.charAt(len - 1 - i);
        }
        return reversed;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

       
        System.out.println("\nLogic 1 (Iterative): " + 
            (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 2 (Recursive): " + 
            (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));

       
        System.out.println("Logic 3 (Char Arrays): " + 
            (isPalindromeCharArray(text) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
