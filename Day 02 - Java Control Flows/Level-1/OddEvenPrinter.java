package Day2.LabPractice_L1;
import java.util.Scanner;
public class OddEvenPrinter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        if (number >= 1){
            for (int i = 1; i <= number; i++){
                if (i % 2 == 0){
                    System.out.println(i + " = EVEN");
                }
                else {
                    System.out.println(i + " = ODD");
                }
            }
        }
        else{
            System.out.println("Enter a valid number!");
        }
        input.close();
    }
}
