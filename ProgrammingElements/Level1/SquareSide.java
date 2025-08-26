import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double perimeter = in.nextDouble();   // I/P => perimeter
            double side = perimeter / 4.0;        // Perimeter = 4 * side
            
            System.out.println("The length of the side is " + side +
                    " whose perimeter is " + perimeter);
        } 
    }
}