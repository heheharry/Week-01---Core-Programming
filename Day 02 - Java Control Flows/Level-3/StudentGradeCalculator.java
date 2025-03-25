package Day2.LabPractice_L3;
import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Physics: ");
        int physics = input.nextInt();
        System.out.print("Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Maths: ");
        int maths = input.nextInt();
        double totalMarks = physics + chemistry + maths;
        double avgMarks = totalMarks / 3;
        double percentage = (totalMarks / 300) * 100;
        String Grade = "", Remarks = "";
        if (percentage >= 80){
            Grade = "A";
            Remarks = "Level-4, above agency-normalised standards";
        }
        else if (percentage >= 70 && percentage <= 79){
            Grade = "B";
            Remarks = "Level-3, at agency-normalised standards";
        }
        else if (percentage >= 60 && percentage <= 69){
            Grade = "C";
            Remarks = "Level-2, below but approaching agency-normalised standards";
        }
        else if (percentage >= 50 && percentage <= 59){
            Grade = "D";
            Remarks = "Level-1, well below agency-normalised standards";
        }
        else if (percentage >= 40 && percentage <= 49){
            Grade = "E";
            Remarks = "Level-1, too below agency-normalised standards";
        }
        else if (percentage <= 39){
            Grade = "R";
            Remarks = "Remedial Standards";
        }
        System.out.println("Avg Marks: " + avgMarks);
        System.out.println("Grade: " + Grade);
        System.out.println("Remarks: " + Remarks);
        input.close();
    }
}
