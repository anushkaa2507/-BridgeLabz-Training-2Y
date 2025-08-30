import java.util.Scanner;

public class CharacterFrequency {

    
    public static String[][] findCharFrequency(String text) {
        int[] freq = new int[256]; 

        int len = findLength(text);

        
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0; 
                index++;
            }
        }

        return result;
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


    public static void displayResult(String[][] arr) {
        System.out.println("\nCharacter Frequency:");
        System.out.println("---------------------");
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("---------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s %-10s\n", arr[i][0], arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        
        String[][] result = findCharFrequency(text);

       
        displayResult(result);

        sc.close();
    }
}
