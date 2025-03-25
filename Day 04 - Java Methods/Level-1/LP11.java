package Day4.LabPractice_L1;
import java.util.Scanner;
public class LP11 {
    public static double calculateWindChill(double temperature, double windSpeed){
        return 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed: ");
        double windSpeed = input.nextDouble();
        if (temperature > 50 || windSpeed <= 3) {
            System.out.println("Wind chill formula is applicable only if temperature is ≤ 50°F and wind speed is > 3 mph.");
        } else {
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
        }
        input.close();
    }

}
