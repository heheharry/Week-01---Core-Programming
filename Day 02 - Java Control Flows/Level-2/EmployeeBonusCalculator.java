package Day2.LabPractice_L2;
import java.util.Scanner;
public class EmployeeBonusCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Salary: ");
        double salary = input.nextDouble();
        System.out.print("Experience: ");
        int experience = input.nextInt();
        if (experience > 5){
            double newSalary = salary * 1.05;
            System.out.println("More than 5 years, New Salary = " + newSalary);
        }
        else{
            System.out.println("Less than 5 years, Salary = " + salary);
        }
        input.close();
    }
}
