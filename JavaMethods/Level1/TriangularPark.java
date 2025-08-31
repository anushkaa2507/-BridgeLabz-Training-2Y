import java.util.Scanner;

public class TriangularPark {

    
    public static double calculateRounds(double a, double b, double c, double distanceToRun) {
        double perimeter = a + b + c; 
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        
        double distance = 5000;

        
        double rounds = calculateRounds(side1, side2, side3, distance);

        
        System.out.println("The athlete must complete " + Math.ceil(rounds) + 
                           " rounds to finish a 5 km run.");

        sc.close();
    }
}
