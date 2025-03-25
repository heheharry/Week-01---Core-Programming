package Day2.LabPractice_L3;
import java.util.Scanner;
public class DigitCounter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        int count = 0;
        while (number != 0){
            number /= 10;
            count += 1;
        }
        System.out.println("Count: " + count);
        input.close();
    }

}
