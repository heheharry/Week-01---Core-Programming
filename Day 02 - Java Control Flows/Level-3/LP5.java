package Day2.LabPractice_L3;
import java.util.Scanner;
public class LP5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        int sum = 0;
        int ogNumber = number;
        while (ogNumber != 0){
            int digit = ogNumber % 10;
            sum += digit * digit * digit;
            ogNumber /= 10;
        }
        if (sum == number){
            System.out.println(number + " is Armstrong number");
        }
        else{
            System.out.println(number + " is not Armstrong number");
        }
        input.close();
    }
}
