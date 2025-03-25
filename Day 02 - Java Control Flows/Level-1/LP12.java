package Day2.LabPractice_L1;
import java.util.Scanner;
public class LP12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        if (number >= 0){
            int sumFormulae = (number * (number + 1)) / 2;
            int sumWhile = 0;
            while (number != 0){
                sumWhile += number;
                number--;
            }
            System.out.println("Sum using Formula: " + sumFormulae);
            System.out.println("Sum using While loop: " + sumWhile);
        }
        else{
            System.out.println("It is not a Natural number");
        }
        input.close();
    }
}
