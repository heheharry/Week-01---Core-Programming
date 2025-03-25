package Day5.LabPractice_L1;
import java.util.Scanner;
public class IllegalArgumentExceptionDemo {
    public static void generateException(String text) {
        System.out.println("Attempting to create a substring with an invalid index range...");
        System.out.println(text.substring(5, 2));
    }
    public static void handleException(String text) {
        try {
            System.out.println("Attempting to create a substring with an invalid index range...");
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();
        handleException(userInput);
        input.close();
    }
}
