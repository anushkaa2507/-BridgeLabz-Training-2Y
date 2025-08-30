import java.util.Scanner;

public class FrequencyNested {

    
    public static String[] findCharFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; 

            freq[i] = 1; 

            
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }

        
        String[] result = new String[chars.length];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

       
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    // Method to display result
    public static void displayResult(String[] arr) {
        System.out.println("\nCharacter Frequency:");
        System.out.println("--------------------");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] result = findCharFrequency(text);
        displayResult(result);

        sc.close();
    }
}
