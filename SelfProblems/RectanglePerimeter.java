import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        // Formula: Perimeter = 2 * (length + width)
        double perimeter = 2 * (length + width);

        // Printing result
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        sc.close();
    }
}
