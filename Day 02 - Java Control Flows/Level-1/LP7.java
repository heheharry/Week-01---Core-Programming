package Day2.LabPractice_L1;
import java.util.Scanner;
public class LP7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.print("Date: ");
        int date = input.nextInt();
        if ((month == 3 && date >= 20) || (month == 4) || (month == 5) || (month == 6 && date <= 20 )) {
            System.out.println("Spring Season");
        }
        else {
            System.out.println("Not a Spring Season");
        }
        input.close();
    }
}
