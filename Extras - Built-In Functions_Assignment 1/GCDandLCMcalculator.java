package Day1.Extras_Assignment_2;
import java.util.Scanner;
public class GCDandLCMcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        scanner.close();
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        displayResult(num1, num2, gcd, lcm);
    }
    private static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
    private static void displayResult(int num1, int num2, int gcd, int lcm) {
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
