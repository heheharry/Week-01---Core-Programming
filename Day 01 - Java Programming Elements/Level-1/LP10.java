package LabPractice_L1;
import java.util.Scanner;
public class LP10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Height: ");
        double height = input.nextDouble();
        double inches = height / 2.54;
        double feet = inches / 12;
        System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
        input.close();
    }
}
