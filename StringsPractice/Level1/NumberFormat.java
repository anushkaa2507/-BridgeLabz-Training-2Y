import java.util.Scanner;

public class NumberFormat {

    public static void generateException(String text) {
        int number = Integer.parseInt(text);  
        System.out.println("Converted number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
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
