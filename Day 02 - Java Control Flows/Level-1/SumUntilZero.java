package Day2.LabPractice_L1;
import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        System.out.print("Enter a number (0 to stop): ");
        double number = input.nextDouble();
        while (number != 0) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }
        System.out.print("Total: " + total);
        input.close();
    }
}
