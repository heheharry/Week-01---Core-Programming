package Day1.Extras_Assignment_2;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation (1-4): ");
        int choice = scanner.nextInt();
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = 0;
        boolean valid = true;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    result = divide(num1, num2);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                valid = false;
        }
        if (valid) {
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
    private static double add(double a, double b) {
        return a + b;
    }
    private static double subtract(double a, double b) {
        return a - b;
    }
    private static double multiply(double a, double b) {
        return a * b;
    }
    private static double divide(double a, double b) {
        return a / b;
    }
}
