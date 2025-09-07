import java.util.Scanner;

public class Temp {
    static Scanner sc = new Scanner(System.in);

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = sc.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            System.out.println(temp + "°F = " + fahrenheitToCelsius(temp) + "°C");
        } else if (choice == 'F') {
            System.out.println(temp + "°C = " + celsiusToFahrenheit(temp) + "°F");
        } else {
            System.out.println("Invalid choice! Enter 'C' or 'F'.");
        }

        sc.close();
    }
}
