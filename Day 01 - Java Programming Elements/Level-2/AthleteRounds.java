package LabPractice_L2;
import java.util.Scanner;
public class AthleteRounds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Side 1: ");
        double side1 = input.nextDouble();
        System.out.print("Side 2: ");
        double side2 = input.nextDouble();
        System.out.print("Side 3: ");
        double side3 = input.nextDouble();
        double totalDistance = side1 + side2 + side3;
        double rounds = 5000 / totalDistance;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
        input.close();
    }
}
