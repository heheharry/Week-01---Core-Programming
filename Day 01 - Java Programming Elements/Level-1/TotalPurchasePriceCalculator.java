package LabPractice_L1;
import java.util.Scanner;
public class TotalPurchasePriceCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Unit Price: ");
        float unitPrice = input.nextFloat();
        System.out.print("Quantity: ");
        float quantity = input.nextFloat();
        float totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        input.close();
    }
}
