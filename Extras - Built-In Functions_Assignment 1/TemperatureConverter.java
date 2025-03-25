package Day1.Extras_Assignment_2;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        if (choice == 1) {
            System.out.println("Converted Temperature: " + fahrenheitToCelsius(temperature) + "°C");
        } else if (choice == 2) {
            System.out.println("Converted Temperature: " + celsiusToFahrenheit(temperature) + "°F");
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
    private static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    private static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
