package Day2.LabPractice_L1;
import java.util.Scanner;
public class LP9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Countdown: ");
        int countdown = input.nextInt();
        for (int i = countdown; i >= 1; i--){
            System.out.println(i);
        }
        input.close();

    }
}
