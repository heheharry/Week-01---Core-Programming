package Day4.LabPractice_L1;
import java.util.Scanner;
public class LP12 {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        return new double[]{sinValue, cosValue, tanValue};
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();
        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.printf("Sin(%.2f°) = %.4f%n", angle, trigValues[0]);
        System.out.printf("Cos(%.2f°) = %.4f%n", angle, trigValues[1]);
        System.out.printf("Tan(%.2f°) = %.4f%n", angle, trigValues[2]);
        input.close();
    }
}
