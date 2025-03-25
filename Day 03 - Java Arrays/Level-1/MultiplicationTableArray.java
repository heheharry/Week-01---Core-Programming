package Day3.LabPractice_L1;
import java.util.Scanner;
public class MultiplicationTableArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] table = new int[11];
        System.out.print("Number: ");
        int number = input.nextInt();
        for(int i = 1; i <= 10; i++){
            table[i] = number * i;
        }
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + table[i]);
        }
        input.close();
    }
}
