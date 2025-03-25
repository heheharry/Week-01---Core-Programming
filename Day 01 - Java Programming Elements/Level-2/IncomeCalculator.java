package LabPractice_L2;
import java.util.Scanner;
public class IncomeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Salary: ");
        int salary = input.nextInt();
        System.out.print("Bonus: ");
        int bonus = input.nextInt();
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + " . Hence total income is " + (salary + bonus));
        input.close();
    }
}
