package Day2.LabPractice_L2;
import java.util.Scanner;
public class LP8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        if (number <= 0){
            System.out.println("Enter a valid number!");
        }
        else{
            int i = 1;
            while(i < number){
                if(number % i == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
        input.close();
    }
}
