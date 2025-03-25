package Day5.LabPractice_L3;
import java.util.Scanner;
public class BMICalculator {
    public static String[][] computeBMI(double[][] data) {
        int numPersons = data.length;
        String[][] results = new String[numPersons][4];
        for (int i = 0; i < numPersons; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            bmi = Math.round(bmi * 10.0) / 10.0;
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal Weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            results[i][0] = String.format("%.1f", data[i][1]);
            results[i][1] = String.format("%.1f", data[i][0]);
            results[i][2] = String.format("%.1f", bmi);
            results[i][3] = status;
        }
        return results;
    }
    public static void displayResults(String[][] results) {
        System.out.println("\nBMI Report:");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-20s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-20s\n", row[0], row[1], row[2], row[3]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPersons = 10;
        double[][] personData = new double[numPersons][2];
        System.out.println("Enter weight (kg) and height (cm) for " + numPersons + " persons:");
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }
        String[][] results = computeBMI(personData);
        displayResults(results);
        scanner.close();
    }
}
