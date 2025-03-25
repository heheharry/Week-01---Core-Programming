package LabPractice_L1;
import java.util.Scanner;
public class LP14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Distance in Feet: ");
        float distanceInFeet = input.nextFloat();
        float distanceInYard = distanceInFeet / 3;
        float distanceInMile = distanceInYard / 1760;
        System.out.println("The distance in yards is " + distanceInYard + " and the distance in miles is " + distanceInMile + " for the given distance in feet " + distanceInFeet);
        input.close();
    }
}
