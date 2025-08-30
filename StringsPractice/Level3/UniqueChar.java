import java.util.Scanner;

public class UniqueChar {

    
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

    
    public static char[] uniqueCharacters(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

           
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = c;
                uniqueCount++;
            }
        }

       
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static String[][] findCharFrequency(String text) {
        int len = findLength(text);
        int[] freq = new int[256];

      
        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        
        char[] uniqueChars = uniqueCharacters(text);

       
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
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
