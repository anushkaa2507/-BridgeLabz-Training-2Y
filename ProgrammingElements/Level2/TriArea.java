import java.util.Scanner;

public class TriArea {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double baseCm = in.nextDouble();    
            double heightCm = in.nextDouble(); 
            
            double areaSqCm = 0.5 * baseCm * heightCm;
            double areaSqIn = areaSqCm / (2.54 * 2.54); 
            
            System.out.println("The Area of the triangle in sq in is " + areaSqIn +
                    " and sq cm is " + areaSqCm);
        } 
    }
}