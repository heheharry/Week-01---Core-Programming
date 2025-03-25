package LabPractice_L1;
import java.util.Scanner;
public class DistanceConverterUserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Km = ");
        double km = input.nextInt();
        double mi = km * 0.621371;
        System.out.println("The total miles is " + mi + " miles for the given " + km + "kms");
        input.close();
    }
}
