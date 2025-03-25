package Day4.LabPractice_L3;
import java.util.Scanner;
public class DigitAnalysisTool {
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
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(Math.abs(number));
        return numStr.contains("0");
    }
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int numDigits = digits.length;
        int sum = 0, original = number;

        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == original;
    }
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2 && digit != max1) {
                max2 = digit;
            }
        }
        return new int[]{max1, max2};
    }
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2 && digit != min1) {
                min2 = digit;
            }
        }
        return new int[]{min1, min2};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = countDigits(number);
        int[] digitsArray = getDigitsArray(number);
        boolean isDuck = isDuckNumber(number);
        boolean isArmstrong = isArmstrongNumber(number);
        int[] largest = findLargestAndSecondLargest(digitsArray);
        int[] smallest = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("Number of digits: " + count);
        System.out.print("Digits in number: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println("\nIs Duck Number: " + isDuck);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        System.out.println("Largest digit: " + largest[0] + ", Second Largest digit: " + largest[1]);
        System.out.println("Smallest digit: " + smallest[0] + ", Second Smallest digit: " + smallest[1]);
        input.close();
    }
}
