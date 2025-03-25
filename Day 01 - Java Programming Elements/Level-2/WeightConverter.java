package LabPractice_L2;
import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Weight: ");
        double weight = input.nextDouble();
        double pounds = weight / 2.2;
        System.out.println("The weight of person in pounds is " + pounds + " and in kgs is " + weight);
        input.close();
    }
}
