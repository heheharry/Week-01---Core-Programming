package Day2.LabPractice_L2;
import java.util.Scanner;
public class LP11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        if (number <= 0 || number > 100){
            System.out.println("Enter a valid number!");
        }
        else{
            for(int i = 100; i > 0; i--){
                if(i % number == 0){
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}
