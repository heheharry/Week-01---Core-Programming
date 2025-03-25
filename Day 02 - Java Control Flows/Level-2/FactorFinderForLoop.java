package Day2.LabPractice_L2;
import java.util.Scanner;
public class FactorFinderForLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        if (number <= 0){
            System.out.println("Enter a valin number!");
        }
        else{
            for (int i = 1; i < number; i++){
                if (number % i == 0){
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}
