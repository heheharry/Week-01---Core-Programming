package LabPractice_L1;
import java.util.Scanner;
public class LP13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Perimeter: ");
        float perimeter = input.nextFloat();
        float side = perimeter / 4;
        System.out.println("The length of side is " + side + " whose perimeter is " + perimeter);
        input.close();
    }
}
