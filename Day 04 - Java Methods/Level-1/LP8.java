package Day4.LabPractice_L1;
import java.util.Scanner;
public class LP8 {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();
        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("Smallest Number: " + result[0]);
        System.out.println("Largest Number: " + result[1]);
        input.close();
    }
}
