package Day1.Extras_Assignment_2;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    private static int generateGuess(int low, int high) {
        return low + (high - low) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it!");

        int low = 1, high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'h' for too high, 'l' for too low, 'c' for correct)");
            char feedback = scanner.next().charAt(0);

            if (feedback == 'c') {
                guessedCorrectly = true;
                System.out.println("Yay! I guessed your number correctly!");
            } else if (feedback == 'h') {
                high = guess - 1;
            } else if (feedback == 'l') {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }
        }
        scanner.close();
    }
}
