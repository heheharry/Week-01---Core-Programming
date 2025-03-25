package Day3.LabPractice_L2;
import java.util.Scanner;
public class LP8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Students: ");
        int numOfStudents = input.nextInt();
        int[] physics = new int[numOfStudents];
        int[] chemistry = new int[numOfStudents];
        int[] maths = new int[numOfStudents];
        double[] percentages = new double[numOfStudents];
        String[] grades = new String[numOfStudents];
        String[] remarks = new String[numOfStudents];
        for (int i = 0; i < numOfStudents; i++){
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            while (true) {
                System.out.print("\nPhysics: ");
                physics[i] = input.nextInt();
                if (physics[i] >= 0 && physics[i] <= 100) break;
                System.out.println("Invalid input! Enter marks between 0 and 100");
            }
            while (true) {
                System.out.print("Chemistry: ");
                chemistry[i] = input.nextInt();
                if (chemistry[i] >= 0 && chemistry[i] <= 100) break;
                System.out.println("Invalid input! Enter marks between 0 and 100");
            }
            while (true) {
                System.out.print("Maths: ");
                maths[i] = input.nextInt();
                if (maths[i] >= 0 && maths[i] <= 100) break;
                System.out.println("Invalid input! Enter marks between 0 and 100");
            }
            double totalMarks = physics[i] + chemistry[i] + maths[i];
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
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.println("Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println("Remarks: " + remarks[i]);
        }
        input.close();
    }
}
