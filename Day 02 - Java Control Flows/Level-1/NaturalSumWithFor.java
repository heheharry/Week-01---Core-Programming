package Day2.LabPractice_L1;
import java.util.Scanner;
public class NaturalSumWithFor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int n = input.nextInt();
        if (n >= 0){
            int sumFormulae = (n * (n + 1)) / 2;
            int sumForLoop = 0;
            for (int i = n; i >= 0; i--){
                sumForLoop += i;
            }
            System.out.println("Sum Using Formula: " + sumFormulae);
            System.out.println("Sum Using Loop: " + sumForLoop);
        }
        else{
            System.out.println("It is not a natural number");
        }
        input.close();
    }
}
