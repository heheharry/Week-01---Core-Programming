package LabPractice_L1;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1 : ");
        int number1 = input.nextInt();
        System.out.print("Number 2 : ");
        int number2 = input.nextInt();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + (number1 + number2) + ", " + (number1 - number2) + ", " + (number1 * number2) + " and " + (number1 / number2));
        input.close();
    }
}
