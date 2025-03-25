package Day2.LabPractice_L1;
import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int n = input.nextInt();
        int totalFac = 1;
        if (n >= 1){
            while(n != 0){
                totalFac *= n;
                n--;
            }
            System.out.println("Factorial: " + totalFac);
        }
        else{
            System.out.println("Enter a valid number!");
        }
        input.close();
    }
}
