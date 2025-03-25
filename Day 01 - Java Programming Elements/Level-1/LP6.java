package LabPractice_L1;

public class LP6 {
    public static void main(String[] args){
        int fee = 125000;
        int discountPercent = 10;
        int discountFee = (fee * 10) / 100;
        int feeToPay = fee - discountFee;
        System.out.println("The discount amount is INR " + discountFee + " and final discounted fee is INR " + feeToPay);
    }
}
