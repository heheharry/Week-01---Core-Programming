package Day2.LabPractice_L1;
import java.util.Scanner;
public class SmallestOfThreeChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1: ");
        int number1 = input.nextInt();
        System.out.print("Number 2: ");
        int number2 = input.nextInt();
        System.out.print("Number 3: ");
        int number3 = input.nextInt();
        if (number1 < number2 && number1 < number3) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        input.close();
    }
}
