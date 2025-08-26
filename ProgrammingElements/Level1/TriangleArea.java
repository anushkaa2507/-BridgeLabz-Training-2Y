import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double base = in.nextDouble();    
            double height = in.nextDouble();  
            
            double areaInSqInches = 0.5 * base * height;
            double areaInSqCm = areaInSqInches * 2.54 * 2.54; 
            
            System.out.println("The area of the triangle is " + areaInSqInches +
                    " square inches and " + areaInSqCm + " square centimeters");
        } 
    }
}