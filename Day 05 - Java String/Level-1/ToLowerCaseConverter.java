package Day5.LabPractice_L1;
import java.util.Scanner;
public class ToLowerCaseConverter {
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = input.nextLine();
        String builtInLowerCase = inputText.toLowerCase();
        String customLowerCase = convertToLowerCase(inputText);
        boolean areEqual = compareStrings(builtInLowerCase, customLowerCase);
        System.out.println("\nOriginal Text: " + inputText);
        System.out.println("Custom Lowercase Conversion: " + customLowerCase);
        System.out.println("Built-in Lowercase Conversion: " + builtInLowerCase);
        System.out.println("Are both conversions equal? " + areEqual);
        input.close();
    }
}
