import java.util.Scanner;

public class PalindromeChecker {
    static Scanner sc = new Scanner(System.in);

   
    public static String getInput() {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

 
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase(); 
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    
    public static void displayResult(String str, boolean result) {
        if (result)
            System.out.println("\"" + str + "\" is a palindrome.");
        else
            System.out.println("\"" + str + "\" is NOT a palindrome.");
    }

    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
        sc.close();
    }
}
