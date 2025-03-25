package Day3.LabPractice_L2;
import java.util.Scanner;
public class LP1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Employees = 10;
        double[] sal = new double[Employees];
        double[] exp = new double[Employees];
        double[] newsal = new double[Employees];
        double[] bonus = new double[Employees];
        double totOldSal = 0, totNewSal = 0, totBonus = 0;
        for (int i = 0; i < Employees; i++){
            System.out.println("Salary: ");
            sal[i] = input.nextDouble();
            System.out.println("Experience: ");
            exp[i] = input.nextDouble();
            if (sal[i] < 0 || exp[i] < 0){
                System.out.println("Invalid, Enter again!");
                i--;
            }
        }
        for (int i = 0; i < Employees; i++){
            double bonusPercentage = (exp[i] > 5) ? 0.05 : 0.02;
            bonus[i] = sal[i] * bonusPercentage;
            newsal[i] = sal[i] + bonus[i];
            totBonus += bonus[i];
            totOldSal += sal[i];
            totNewSal += newsal[i];

        }
        System.out.println("Employee bonus and new salary: ");
        for(int i = 0; i < Employees; i++){
            System.out.println("Employee: " + (i + 1) + " | Old Salary = " + sal[i] + " | Bonus = " + bonus[i] + " | New Salary = " + newsal[i]);

        }
        System.out.println("Total Bonus: " + totBonus);
        System.out.println("Total Old Salary: " + totOldSal);
        System.out.println("Total New Salary: " + totNewSal);
        input.close();
    }
}
