import java.util.Scanner;

public class StringIndex {

 
    public static void generateException(String text) {
        
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

 
    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
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
