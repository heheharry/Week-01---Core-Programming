package Day4.LabPractice_L2;
import java.util.Scanner;
public class MassTemperatureVolumeConverter {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.print("Enter Celsius: ");
        double celsius = input.nextDouble();
        System.out.print("Enter Pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter Kilograms: ");
        double kilograms = input.nextDouble();
        System.out.print("Enter Gallons: ");
        double gallons = input.nextDouble();
        System.out.print("Enter Liters: ");
        double liters = input.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit = " + convertFahrenheitToCelsius(fahrenheit) + " Celsius");
        System.out.println(celsius + " Celsius = " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit");
        System.out.println(pounds + " Pounds = " + convertPoundsToKilograms(pounds) + " Kilograms");
        System.out.println(kilograms + " Kilograms = " + convertKilogramsToPounds(kilograms) + " Pounds");
        System.out.println(gallons + " Gallons = " + convertGallonsToLiters(gallons) + " Liters");
        System.out.println(liters + " Liters = " + convertLitersToGallons(liters) + " Gallons");
        input.close();
    }
}
