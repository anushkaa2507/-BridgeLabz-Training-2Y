import java.util.Scanner;

public class VowelConsonant {

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

    
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String type = checkCharType(c);

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

       
        int[] result = countVowelsAndConsonants(input);

       
        System.out.println("\nVowels Count: " + result[0]);
        System.out.println("Consonants Count: " + result[1]);

        sc.close();
    }
}
