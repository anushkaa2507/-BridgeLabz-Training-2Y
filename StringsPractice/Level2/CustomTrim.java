import java.util.Scanner;

public class CustomTrim {

    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

       
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

   
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();

       
        int[] indexes = findTrimIndexes(input);

        
        String customTrimmed = customSubstring(input, indexes[0], indexes[1]);

       
        String builtInTrimmed = input.trim();

        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        
        System.out.println("\nCustom Trim Result: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trim Result: \"" + builtInTrimmed + "\"");
        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}
