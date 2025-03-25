package Day5.LabPractice_L2;
import java.util.Scanner;
public class LP7 {
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }
    public static String customSubstring(String text, int start, int end) {
        StringBuilder subStr = new StringBuilder();
        for (int i = start; i < end; i++) {
            subStr.append(text.charAt(i));
        }
        return subStr.toString();
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String inputText = scanner.nextLine();
        int[] indexes = findTrimIndexes(inputText);
        String customTrimmed = customSubstring(inputText, indexes[0], indexes[1]);
        String builtInTrimmed = inputText.trim();
        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);
        System.out.println("\nOriginal String: '" + inputText + "'");
        System.out.println("Custom Trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in Trimmed: '" + builtInTrimmed + "'");
        System.out.println("Are both methods equal? " + areEqual);
        scanner.close();
    }
}
