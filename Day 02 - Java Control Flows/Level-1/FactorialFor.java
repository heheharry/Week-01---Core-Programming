package Day2.LabPractice_L1;
import java.util.Scanner;
public class FactorialFor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int n = input.nextInt();
        if(n >= 0){
            int factorial = 1;
            for (int i = n; i >=1; i--){
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        }
        else{
            System.out.println("Enter a valid number!");
        }
        input.close();
    }
}
