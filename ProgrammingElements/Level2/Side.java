import java.util.Scanner;

public class Side {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double perimeter = in.nextDouble();   
            double side = perimeter / 4.0;      
            
            System.out.println("The length of the side is " + side +
                    " whose perimeter is " + perimeter);
        } 
    }
}