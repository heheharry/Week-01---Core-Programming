package Day5.LabPractice_L1;
import java.util.Scanner;
public class SubstringComparer {
    public static String createSubstring(String str, int start, int end) {
        StringBuilder subStr = new StringBuilder();
        for (int i = start; i < end; i++) {
            subStr.append(str.charAt(i));
        }
        return subStr.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();
        if (start < 0 || end > mainString.length() || start >= end) {
            System.out.println("Invalid indices. Please try again.");
            return;
        }
        String manualSubstring = createSubstring(mainString, start, end);
        String builtInSubstring = mainString.substring(start, end);
        boolean isEqual = compareStrings(manualSubstring, builtInSubstring);
        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + isEqual);
        scanner.close();
    }

}
