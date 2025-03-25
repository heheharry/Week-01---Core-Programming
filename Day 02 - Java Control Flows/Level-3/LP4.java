package Day2.LabPractice_L3;
import java.util.Scanner;
public class LP4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        boolean isPrime = true;
        if (number < 1){
            System.out.println("Enter a valid number!");
        }
        else{
            for(int i = 2; i < Math.sqrt(number); i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
    }
}
