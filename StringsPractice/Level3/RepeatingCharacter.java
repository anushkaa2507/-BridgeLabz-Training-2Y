import java.util.Scanner;

public class RepeatingCharacter {

    
    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256]; 

        
        int len = findLength(text);
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

       
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (freq[c] == 1) {
                return c;
            }
        }

        return '\0'; 
    }

    
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        
        char result = findFirstNonRepeatingChar(text);

        
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
