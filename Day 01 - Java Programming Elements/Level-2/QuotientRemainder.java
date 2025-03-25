package LabPractice_L2;
import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1: ");
        int number1 = input.nextInt();
        System.out.print("Number 2: ");
        int number2 = input.nextInt();
        System.out.println("The Quotient is " + (number1 / number2) + " and Remainder is " + (number1 % number2) + " of two numbers " + number1 + " and " + number2);
        input.close();
    }
}
