package Day1.Extras_Assignment_2;
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = getInput(scanner);
        scanner.close();
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
    private static String getInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine().replaceAll("\\s", "").toLowerCase();
    }
    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
