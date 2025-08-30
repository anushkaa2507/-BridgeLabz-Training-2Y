import java.util.Scanner;

public class ArrayIndex {

    
    public static void generateException(String[] names) {
   
        System.out.println("Accessing invalid index: " + names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        String[] names = new String[size];

        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

    
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("Now handling the exception properly...");

        handleException(names);

        sc.close();
    }
}
