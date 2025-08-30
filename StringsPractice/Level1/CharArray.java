import java.util.Scanner;

public class CharArray {

  
    public static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i); 
        }
        return arr;
    }

    
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

   
    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String text = sc.next();

        
        char[] customArr = customToCharArray(text);
        char[] builtInArr = text.toCharArray();

       
        boolean areSame = compareCharArrays(customArr, builtInArr);

        
        System.out.print("Custom char array: ");
        printCharArray(customArr);

        System.out.print("Built-in char array: ");
        printCharArray(builtInArr);

        System.out.println("Are both arrays same? " + areSame);

        sc.close();
    }
}
