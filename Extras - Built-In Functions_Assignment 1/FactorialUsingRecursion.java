package Day1.Extras_Assignment_2;
import java.util.Scanner;
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getInput(scanner);
        scanner.close();
        long result = factorial(number);
        displayResult(number, result);
    }
    private static int getInput(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }
    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    private static void displayResult(int num, long fact) {
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
