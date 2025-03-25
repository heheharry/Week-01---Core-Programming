package Day4.LabPractice_L3;
import java.util.Arrays;
import java.util.Scanner;
public class LP4 {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(Math.abs(number));
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseDigitsArray(digits);
        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Original Digits Array: " + Arrays.toString(digits));
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversedDigits));
        System.out.println("Is the number a palindrome? " + isPalindrome(number));
        System.out.println("Is the number a Duck Number? " + isDuckNumber(number));
        input.close();
    }
}
