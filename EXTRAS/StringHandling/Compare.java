import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int minLen = Math.min(s1.length(), s2.length());
        int i = 0;

       
        while (i < minLen && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }

        if (i == minLen) {
            if (s1.length() == s2.length())
                System.out.println("Both strings are equal");
            else if (s1.length() < s2.length())
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
            else
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
        } else {
            if (s1.charAt(i) < s2.charAt(i))
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
            else
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
        }
    }
}
