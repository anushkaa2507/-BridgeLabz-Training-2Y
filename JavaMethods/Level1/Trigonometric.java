import java.util.Scanner;

public class Trigonometric {

   
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); 
        double[] results = new double[3];       

        results[0] = Math.sin(radians);
        results[1] = Math.cos(radians);
        results[2] = Math.tan(radians);

        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        
        double[] results = calculateTrigonometricFunctions(angle);

        
        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine   = " + results[0]);
        System.out.println("Cosine = " + results[1]);
        System.out.println("Tangent= " + results[2]);

        sc.close();
    }
}
