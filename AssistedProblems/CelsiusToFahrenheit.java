import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = Scanner.nextDouble();

        // Conversion formula
        double fahrenheit = (celsius * 9/5) + 32;

        // Display result
        System.out.println(celsius + " °C = " + fahrenheit + " °F");

        Scanner.close();
    }
}
