import java.util.Scanner;

public class FtToYard {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double distanceInFeet = in.nextDouble();   
            double yards = distanceInFeet / 3.0;       
            double miles = yards / 1760.0;             
            
            System.out.println("The distance in yards is " + yards +
                    " while the distance in miles is " + miles);
        } 
    }
}