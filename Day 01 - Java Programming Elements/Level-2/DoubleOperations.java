package LabPractice_L2;
import java.util.Scanner;
public class DoubleOperations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();
        double m = a + b * c;
        double n = a * b + c;
        double o = c + a / b;
        double p = a % b + c;
        System.out.println("The results of double operations are " + m + ", " + n + ", " + o + " and " + p);
        input.close();
    }
}
