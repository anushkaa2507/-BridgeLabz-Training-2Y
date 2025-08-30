import java.util.Scanner;

public class ShortestLongest {

    
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

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[index++] = word;
                start = i + 1;
            }
        }

        
        String lastWord = "";
        for (int j = start; j < length; j++) {
            lastWord += text.charAt(j);
        }
        words[index] = lastWord;

        return words;
    }

    
    public static String[][] buildWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            table[i][0] = words[i];             
            table[i][1] = String.valueOf(len);  
        }
        return table;
    }

    
    public static int[] findShortestAndLongest(String[][] table) {
        int shortestIdx = 0;
        int longestIdx = 0;

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            int shortestLen = Integer.parseInt(table[shortestIdx][1]);
            int longestLen = Integer.parseInt(table[longestIdx][1]);

            if (len < shortestLen) {
                shortestIdx = i;
            }
            if (len > longestLen) {
                longestIdx = i;
            }
        }

        return new int[]{shortestIdx, longestIdx};
    }

    
    public static void displayTable(String[][] table) {
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        
        String[] words = customSplit(text);

        
        String[][] table = buildWordLengthTable(words);

        
        displayTable(table);

       
        int[] result = findShortestAndLongest(table);

        System.out.println("\nShortest Word: " + table[result[0]][0] +
                           " (Length: " + table[result[0]][1] + ")");
        System.out.println("Longest Word: " + table[result[1]][0] +
                           " (Length: " + table[result[1]][1] + ")");

        sc.close();
    }
}
