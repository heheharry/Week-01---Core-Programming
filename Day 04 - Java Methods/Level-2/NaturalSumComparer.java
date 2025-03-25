package Day4.LabPractice_L2;
import java.util.Scanner;
public class NaturalSumComparer {
    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive natural number.");
        } else {
            // Calculate sum using recursion
            int sumUsingRecursion = sumRecursive(n);

            // Calculate sum using formula
            int sumUsingFormula = sumFormula(n);
            System.out.println("\nResults: \nSum using Recursion: " + sumUsingRecursion);
            System.out.println("Sum using Formula: " + sumUsingFormula);
            if (sumUsingRecursion == sumUsingFormula) {
                System.out.println("Both computations match!");
            } else {
                System.out.println("Mismatch detected!");
            }
        }
        input.close();
    }
}
