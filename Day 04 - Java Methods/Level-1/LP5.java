package Day4.LabPractice_L1;
import java.util.Scanner;
public class LP5 {
    public static int checkNumber(int n){
        if (n < 0){
            return -1;
        }
        else if(n > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int n = input.nextInt();
        int result = checkNumber(n);
        if (result == 1) {
            System.out.println("The number is Positive");
        } else if (result == -1) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
        input.close();
    }
}
