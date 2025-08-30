import java.util.Scanner;

public class VowelConsonantTable {

    
    public static String checkCharType(char c) {
       
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);  
        }

        
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    
    public static String[][] findCharTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);   
            result[i][1] = checkCharType(c);    
        }

        return result;
    }

   
    public static void displayResult(String[][] arr) {
        System.out.printf("%-10s%-15s%n", "Character", "Type");
        System.out.println("-------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s%-15s%n", arr[i][0], arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

       
        String[][] result = findCharTypes(input);

        
        displayResult(result);

        sc.close();
    }
}
