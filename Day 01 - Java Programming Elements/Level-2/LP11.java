package LabPractice_L2;
import java.util.Scanner;
public class LP11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = input.nextDouble();
        System.out.print("Rate: ");
        double rate = input.nextDouble();
        System.out.print("Time: ");
        double time = input.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println("The simple interest is " + si + " for prinipal " + principal + ", rate " + rate + " and time " + time);
        input.close();
    }
}
