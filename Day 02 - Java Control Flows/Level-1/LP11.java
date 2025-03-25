package Day2.LabPractice_L1;
import java.util.Scanner;
public class LP11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true){
            System.out.print("Enter number (0 to stop): ");
            double number = input.nextDouble();
            if (number <= 0){
                break;
            }
            total += number;
        }
        System.out.println("Total: " + total);
        input.close();
    }
}
