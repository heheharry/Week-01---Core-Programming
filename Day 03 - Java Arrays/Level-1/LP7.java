package Day3.LabPractice_L1;
import java.util.Scanner;
public class LP7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        int[] odd = new int[number /2 + 1];
        int[] even = new int[number /2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;
        if(number <= 0){
            System.out.println("Enter a valid number!");
            return;
        }
        else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    even[evenIndex] = i;
                    evenIndex++;
                } else {
                    odd[oddIndex] = i;
                    oddIndex++;
                }
            }
            System.out.println("Even Numbers: ");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(even[i] + " ");
            }
            System.out.println("\nOdd Numbers: ");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(odd[i] + " ");
            }
        }
        input.close();
    }
}
