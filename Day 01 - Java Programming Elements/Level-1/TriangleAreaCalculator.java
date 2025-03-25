package LabPractice_L1;
import java.util.Scanner;
public class TriangleAreaCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Base: ");
        double base = input.nextDouble();
        System.out.print("Height: ");
        double height = input.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Area of triangle in square centimeters is " + area + " and in square inches is " + area / 2.54);
        input.close();
    }
}
