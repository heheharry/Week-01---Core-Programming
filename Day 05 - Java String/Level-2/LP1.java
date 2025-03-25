package Day5.LabPractice_L2;
import java.util.Scanner;
public class LP1 {
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.next();
        int builtInLength = inputText.length();
        int customLength = findStringLength(inputText);
        System.out.println("\nOriginal Text: " + inputText);
        System.out.println("Length using built-in method: " + builtInLength);
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Are both lengths equal? " + (builtInLength == customLength));

        scanner.close();
    }
}
