import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    
    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

   
    public static String getFeedback(int guess) {
        System.out.print("Is your number " + guess + "? (high/low/correct): ");
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        int low = 1, high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (!found && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getFeedback(guess);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number: " + guess);
                found = true;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid input! Please type high, low, or correct.");
            }
        }

        if (!found) {
            System.out.println("Hmm, something went wrong. Are you sure you followed the rules? 😅");
        }
    }
}
