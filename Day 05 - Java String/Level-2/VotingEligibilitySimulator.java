package Day5.LabPractice_L2;
import java.util.Random;
import java.util.Scanner;
public class VotingEligibilitySimulator {
    public static int[] generateAges(int numStudents) {
        Random random = new Random();
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            ages[i] = random.nextInt(50) - 10;
        }
        return ages;
    }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        return results;
    }
    public static void displayResults(String[][] data) {
        System.out.println("\nStudent Age Voting Eligibility");
        System.out.println("-------------------------------");
        System.out.printf("%-10s %-15s\n", "Age", "Voting Status");
        System.out.println("-------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[] ages = generateAges(numStudents);
        String[][] results = checkVotingEligibility(ages);
        displayResults(results);
        scanner.close();
    }
}
