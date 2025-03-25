package Day5.LabPractice_L2;
import java.util.Random;
import java.util.Scanner;
public class LP9 {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int index = (int) (Math.random() * 3);
        return choices[index];
    }
    public static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        } else if (
                (playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                        (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                        (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))
        ) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }
    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][2];
        stats[0][0] = "Player Wins";
        stats[0][1] = String.format("%.2f%%", ((double) playerWins / totalGames) * 100);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.format("%.2f%%", ((double) computerWins / totalGames) * 100);
        return stats;
    }
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("----------------------------------");
        System.out.printf("%-10s %-12s %-15s\n", "Game", "Player", "Computer");
        System.out.println("----------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10s %-12s %-15s\n", results[i][0], results[i][1], results[i][2]);
        }
        System.out.println("\nWin Statistics:");
        System.out.println("-----------------------------");
        System.out.printf("%-15s %-10s\n", "Category", "Win %");
        System.out.println("-----------------------------");
        for (String[] row : stats) {
            System.out.printf("%-15s %-10s\n", row[0], row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine();
        String[][] results = new String[numGames][3];
        int playerWins = 0, computerWins = 0;
        for (int i = 0; i < numGames; i++) {
            System.out.print("\nEnter Rock, Paper, or Scissors: ");
            String playerChoice = scanner.nextLine();
            while (!playerChoice.equalsIgnoreCase("Rock") &&
                    !playerChoice.equalsIgnoreCase("Paper") &&
                    !playerChoice.equalsIgnoreCase("Scissors")) {
                System.out.print("Invalid choice. Please enter Rock, Paper, or Scissors: ");
                playerChoice = scanner.nextLine();
            }
            String computerChoice = getComputerChoice();
            String result = determineWinner(playerChoice, computerChoice);
            if (result.equals("Player Wins")) {
                playerWins++;
            } else if (result.equals("Computer Wins")) {
                computerWins++;
            }
            results[i][0] = "Game " + (i + 1);
            results[i][1] = playerChoice;
            results[i][2] = computerChoice;
        }
        String[][] stats = calculateStats(playerWins, computerWins, numGames);
        displayResults(results, stats);
        scanner.close();
    }
}
