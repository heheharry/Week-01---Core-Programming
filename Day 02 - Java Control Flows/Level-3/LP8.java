package Day2.LabPractice_L3;
import java.util.Scanner;
public class LP8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        int sum = 0;
        int ogNumber = number;
        while(ogNumber > 0){
            int digit = ogNumber % 10;
            sum += digit;
            ogNumber /= 10;
        }
        if (ogNumber % sum == 0){
            System.out.println(number + " is a Harshad number");
        }
        else{
            System.out.println(number + " is not a Harshad number");
        }
        input.close();
    }
}
