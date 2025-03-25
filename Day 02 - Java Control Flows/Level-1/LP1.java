package Day2.LabPractice_L1;
import java.util.Scanner;
public class LP1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("number: ");
        int number = input.nextInt();
        if (number % 5 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        input.close();
    }
}
