package Day5.LabPractice_L1;
import java.util.Scanner;
public class LP7 {
    public static void generateException(String text) {
        System.out.println("Attempting to parse integer from input...");
        int number = Integer.parseInt(text);
        System.out.println("Parsed Number: " + number);
    }
    public static void handleException(String text) {
        try {
            System.out.println("Attempting to parse integer from input...");
            int number = Integer.parseInt(text);
            System.out.println("Parsed Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format - " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        handleException(userInput);
        scanner.close();
    }
}
