package Day4.LabPractice_L1;
import java.util.Scanner;
public class SimpleInterestCalculator {
    public static double calculateSI(double principal, double rate, double time){
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = input.nextDouble();
        System.out.print("Rate: ");
        double rate = input.nextDouble();
        System.out.print("Time: ");
        double time = input.nextDouble();
        double SI = calculateSI(principal, rate, time);
        System.out.println("The Simple Interest is " + SI + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        input.close();
    }
}
