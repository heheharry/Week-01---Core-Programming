package Day2.LabPractice_L1;
import java.util.Scanner;
public class LP8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Countdown: ");
        int countdown = input.nextInt();
        while (countdown >= 1) {
            System.out.println(countdown);
            countdown--;
        }
        input.close();
    }
}
