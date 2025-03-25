package LabPractice_L1;
import java.util.Scanner;
public class FeeDiscountInputCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Student Fee: ");
        int studentFee = input.nextInt();
        System.out.print("Discount Percent: ");
        int discountPercent = input.nextInt();
        int discountFee = (studentFee * 10) / 100;
        int feeToPay = studentFee - discountFee;
        System.out.println("The discount amount is INR " + discountFee + " and final discounted fee is INR " + feeToPay);
        input.close();
    }
}
