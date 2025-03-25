package Day2.LabPractice_L3;
import java.util.Scanner;
public class DayOfWeekCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Month: ");
        int m = input.nextInt();
        System.out.print("date: ");
        int d = input.nextInt();
        System.out.print("year: ");
        int y = input.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day is: " + d0);
        input.close();
    }
}
