package Day2.LabPractice_L2;
import java.util.Scanner;
public class LP13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number <= 0 || number > 100){
            System.out.println("Enter a valid number!");
        }
        else{
            int i = 100;
            while (i > 0){
                if(i % number == 0){
                    System.out.println(i);
                }
                i--;
            }
        }
        input.close();
    }
}
