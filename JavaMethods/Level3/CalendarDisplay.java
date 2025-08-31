import java.util.Scanner;

public class CalendarDisplay {

    private static final String[] months = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

 
    private static final int[] daysInMonth = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

  
    public static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    
    public static int getFirstDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;      
        int j = year / 100;     
        int h = (1 + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        
        return (h + 6) % 7; 
    }

   
    public static void displayCalendar(int month, int year) {
        System.out.println("\n     " + months[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int numDays = getNumberOfDays(month, year);

      
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

       
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0) { 
                System.out.println();
            }
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);
    }
}
