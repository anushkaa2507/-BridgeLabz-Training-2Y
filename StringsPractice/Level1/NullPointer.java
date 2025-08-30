public class NullPointer {

    
    public static void generateException() {
        String text = null;  
        
        System.out.println("Length of text: " + text.length());
    }

    
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
    
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("Now handling the exception properly...");
        
        
        handleException();
    }
}
