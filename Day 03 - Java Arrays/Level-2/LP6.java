package Day3.LabPractice_L2;
import java.util.Scanner;
public class LP6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter height of person " + (i + 1) + ": ");
            heights[i] = input.nextDouble() / 100;
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            weights[i] = input.nextDouble();
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] >= 18.5 && bmi[i] < 24.9)
                status[i] = "Normal weight";
            else if (bmi[i] >= 25 && bmi[i] < 29.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        System.out.println("\nBMI Results");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + heights[i] + " meters");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + status[i]);
            System.out.println();
        }
        input.close();
    }
}
