package LabPractice_L2;
import java.util.Scanner;
public class LP5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius");
        input.close();
    }
}
