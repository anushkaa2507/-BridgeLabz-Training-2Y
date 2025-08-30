import java.util.Scanner;

public class IllegalArgument {

 
    public static void generateException(String text) {
    
        System.out.println("Substring: " + text.substring(5, 2));
    }


    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {   
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.next();

       
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("Now handling the exception properly...");

        handleException(input);

        sc.close();
    }
}
