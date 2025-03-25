package Day3.LabPractice_L2;
import java.util.Scanner;
public class LP9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Students: ");
        int numOfStudents = input.nextInt();
        int[][] marks = new int[numOfStudents][3];
        double[] percentages = new double[numOfStudents];
        String[] grades = new String[numOfStudents];
        String[] remarks = new String[numOfStudents];
        for (int i = 0; i < numOfStudents; i++){
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++){
                String subject = (j == 0) ? "Physics": (j == 1) ? "Chemistry": "Maths";
                while (true) {
                    System.out.print(subject + ": ");
                    marks[i][j] = input.nextInt();
                    if (marks[i][j] >= 0 && marks[i][j] <= 100) break;
                    System.out.println("Invalid input! Enter marks between 0 and 100");
                }
            }
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;
            if (percentages[i] >= 80) {
                grades[i] = "A";
                remarks[i] = "Level-4, above agency-normalised standards";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
                remarks[i] = "Level-3, at agency-normalised standards";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
                remarks[i] = "Level-2, below but approaching agency-normalised standards";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
                remarks[i] = "Level-1, well below agency-normalised standards";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
                remarks[i] = "Level-1, too below agency-normalised standards";
            } else {
                grades[i] = "R";
                remarks[i] = "Remedial Standards";
            }
        }
        System.out.println("\nStudent Results");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println("Remarks: " + remarks[i]);
        }
        input.close();
    }
}
