import java.util.Scanner;

public class CustomSplit {

    
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
           
        }
        return count;
    }

   
    public static String[] customSplit(String text) {
        int length = findLength(text);

      
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        
        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

       
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[wordIndex++] = word;
                start = i + 1;
            }
        }

        
        String lastWord = "";
        for (int j = start; j < length; j++) {
            lastWord += text.charAt(j);
        }
        words[wordIndex] = lastWord;

        return words;
    }

  
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

   
    public static void printArray(String[] arr) {
        for (String word : arr) {
            System.out.print(word + " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        
        String[] customWords = customSplit(text);

       
        String[] builtInWords = text.split(" ");

        
        boolean areSame = compareArrays(customWords, builtInWords);

        
        System.out.print("Custom Split: ");
        printArray(customWords);

        System.out.print("Built-in Split: ");
        printArray(builtInWords);

        System.out.println("Are both arrays same? " + areSame);

        sc.close();
    }
}
