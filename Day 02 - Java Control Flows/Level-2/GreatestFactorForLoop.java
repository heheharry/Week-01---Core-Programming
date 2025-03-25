package Day2.LabPractice_L2;
import java.util.Scanner;
public class GreatestFactorForLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        if (number <= 1) {
            System.out.println("Enter a valid number!");
        }
        else {
            int GF = 1;
            for (int i = number - 1; i >= 1; i--){
                if(number % i == 0){
                    GF = i;
                    break;
                }
            }
            System.out.println("Greatest Factor of " + number + " is " + GF);
        }
        input.close();
    }
}
