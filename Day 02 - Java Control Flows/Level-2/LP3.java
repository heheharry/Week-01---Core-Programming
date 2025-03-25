package Day2.LabPractice_L2;
import java.util.Scanner;
public class LP3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        for (int i = 6; i <= 9; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        input.close();
    }
}
