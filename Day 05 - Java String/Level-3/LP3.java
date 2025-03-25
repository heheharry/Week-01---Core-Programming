package Day5.LabPractice_L3;
import java.util.Scanner;
public class LP3 {
    public static char findFirstNonRepeatingChar(String text) {
        int[] charFrequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (charFrequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        char result = findFirstNonRepeatingChar(inputText);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        scanner.close();
    }
}
