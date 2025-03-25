package Day5.LabPractice_L2;
import java.util.Random;
import java.util.Scanner;
public class StudentGradeCalculator {
    public static int[][] generateMarks(int numStudents) {
        Random rand = new Random();
        int[][] marks = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = rand.nextInt(41) + 60;
            marks[i][1] = rand.nextInt(41) + 60;
            marks[i][2] = rand.nextInt(41) + 60;
        }
        return marks;
    }
    public static double[][] calculateScores(int[][] marks) {
        int numStudents = marks.length;
        double[][] results = new double[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
    public static String[][] assignGrades(double[][] scores) {
        int numStudents = scores.length;
        String[][] grades = new String[numStudents][2];
        for (int i = 0; i < numStudents; i++) {
            double percentage = scores[i][2];
            if (percentage >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "Level-4, above agency-normalised standards";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
                grades[i][1] = "Level-3, at agency-normalised standards";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
                grades[i][1] = "Level-2, below but approaching agency-normalised standards";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
                grades[i][1] = "Level-1, well below agency-normalised standards";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
                grades[i][1] = "Level-1, too below agency-normalised standards";
            } else {
                grades[i][0] = "R";
                grades[i][1] = "Remedial Standards";
            }
        }
        return grades;
    }
    public static void displayResults(int[][] marks, double[][] scores, String[][] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], scores[i][0], scores[i][1], scores[i][2], grades[i][0]);
        }
        System.out.println("\nRemarks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Student %d: %s\n", (i + 1), grades[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[][] marks = generateMarks(numStudents);
        double[][] scores = calculateScores(marks);
        String[][] grades = assignGrades(scores);
        displayResults(marks, scores, grades);
        scanner.close();
    }
}
