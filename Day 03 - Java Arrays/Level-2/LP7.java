package Day3.LabPractice_L2;
import java.util.Scanner;
public class LP7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Height of person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble() / 100;
            System.out.print("Weight of person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
        }
        for (int i = 0; i < numPersons; i++) {
            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 24.9) weightStatus[i] = "Normal weight";
            else if (bmi < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        System.out.println("\nBMI Results");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " meters");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Weight Status: " + weightStatus[i]);
        }
        input.close();
    }
}
