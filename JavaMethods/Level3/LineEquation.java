import java.util.Scanner;

public class LineEquation {

    
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

   
    public static double[] calculateLineEquation(int x1, int y1, int x2, int y2) {
        double[] result = new double[2]; 

        if (x1 == x2) {
            System.out.println("The line is vertical. Equation: x = " + x1);
            result[0] = Double.POSITIVE_INFINITY; 
            result[1] = Double.NaN; 
            return result;
        }

        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;                    

        result[0] = m;
        result[1] = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter x1, y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.2f%n", distance);

        
        double[] lineEq = calculateLineEquation(x1, y1, x2, y2);

        if (Double.isInfinite(lineEq[0])) {
            System.out.println("Equation of line: x = " + x1);
        } else {
            System.out.printf("Equation of line: y = %.2fx + %.2f%n", lineEq[0], lineEq[1]);
        }

        sc.close();
    }
}
