package Day4.LabPractice_L3;
import java.util.Scanner;
public class LP9 {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - (slope * x1);
        return new double[]{slope, yIntercept};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between points: " + distance);
        if (x1 == x2) {
            System.out.println("Vertical Line: x = " + x1);
        } else {
            double[] equation = findLineEquation(x1, y1, x2, y2);
            System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
        }
        input.close();
    }
}
