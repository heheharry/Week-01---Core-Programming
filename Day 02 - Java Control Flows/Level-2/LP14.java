package Day2.LabPractice_L2;
import java.util.Scanner;
public class LP14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        System.out.print("Power: ");
        int power = input.nextInt();
        if(number <= 0 || power <= 0){
            System.out.println("Enter a valid input!");
        }
        else{
            int result = 1;
            int i = 0;
            while(i != power){
                result *= number;
                i++;
            }
            System.out.println("Result: " + result);
        }
        input.close();
    }
}
