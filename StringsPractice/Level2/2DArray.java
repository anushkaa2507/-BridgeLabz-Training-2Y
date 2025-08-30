import java.util.Scanner;

public class 2DArray {

   
    public static int findLengt h(String text) {
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

        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;

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

    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; 
            result[i][1] = String.valueOf(findLength(words[i])); 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

      
        String[] words = customSplit(text);

       
        String[][] table = wordWithLengths(words);

      
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < table.length; i++) {
          
            int length = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t" + length);
        }

        sc.close();
    }
}
