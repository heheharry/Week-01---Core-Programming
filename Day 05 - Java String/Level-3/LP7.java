package Day5.LabPractice_L3;
import java.util.Scanner;
public class LP7 {
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseString(text);
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - i - 1);
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        boolean result1 = isPalindromeIterative(inputText);
        boolean result2 = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        boolean result3 = isPalindromeUsingCharArray(inputText);
        System.out.println("\nPalindrome Check Results:");
        System.out.println("1. Using Iterative Approach: " + (result1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("2. Using Recursion: " + (result2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("3. Using Character Array: " + (result3 ? "Palindrome" : "Not a Palindrome"));
        scanner.close();
    }
}
