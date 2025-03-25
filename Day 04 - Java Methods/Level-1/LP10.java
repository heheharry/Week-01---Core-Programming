package Day4.LabPractice_L1;
import java.util.Scanner;
public class LP10 {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        return new int[]{number / divisor, number % divisor};
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
        input.close();
    }
}
