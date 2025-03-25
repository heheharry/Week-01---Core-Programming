package Day3.LabPractice_L2;
import java.util.Scanner;
public class NumberReverser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        int digitCount = String.valueOf(number).length();
        int[] digits = new int[digitCount];
        int index = 0;
        int temp = number;
        while(temp != 0){
            digits[index++] = temp % 10;
            temp /= 10;
        }
        System.out.println("Reversed Number: ");
        for (int i = 0; i < index; i++){
            System.out.print(digits[i]);
        }
        input.close();
    }
}
