package Day4.LabPractice_L3;
import java.util.Random;
import java.util.Scanner;
public class StudentScoreCardGenerator {
    public static int[][] generateStudentScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51);
            scores[i][1] = 50 + random.nextInt(51);
            scores[i][2] = 50 + random.nextInt(51);
        }
        return scores;
    }
    public static double[][] computeResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 3;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
        System.out.println("---------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[][] scores = generateStudentScores(numStudents);
        double[][] results = computeResults(scores);
        displayScorecard(scores, results);
        input.close();
    }
}
