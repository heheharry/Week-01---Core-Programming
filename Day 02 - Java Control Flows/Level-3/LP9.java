package Day2.LabPractice_L3;
import java.util.Scanner;
public class LP9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if (sum > number){
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not an Abundant Number");
        }
        input.close();
    }
}
