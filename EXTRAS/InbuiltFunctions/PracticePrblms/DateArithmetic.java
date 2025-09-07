import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter date (yyyy-mm-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);

        
        LocalDate modified = date.plusDays(7).plusMonths(1).plusYears(2);

        
        modified = modified.minusWeeks(3);

        System.out.println("Final Date: " + modified);
    }
}
