package LabPractice_L2;
import java.util.Scanner;
public class LP7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1: ");
        int number1 = input.nextInt();
        System.out.print("Number 2: ");
        int number2 = input.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
        input.close();
    }
}
