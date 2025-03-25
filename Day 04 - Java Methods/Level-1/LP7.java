package Day4.LabPractice_L1;
import java.util.Scanner;
public class LP7 {
    public static int sumOfNaturalNumbers(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int n = input.nextInt();
        int result = sumOfNaturalNumbers(n);
        System.out.println("Sum of " + n + " Natural Numbers is: " + result);
        input.close();
    }
}
