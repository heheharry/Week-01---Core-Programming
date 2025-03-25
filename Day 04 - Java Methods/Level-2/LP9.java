package Day4.LabPractice_L2;
import java.util.Scanner;
public class LP9 {
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 < number2) return -1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is Positive and ");
                if (isEven(number)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println(number + " is Negative.");
            }
        }
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println(numbers[0] + " > " + numbers[numbers.length - 1]);
        } else if (result == -1) {
            System.out.println(numbers[0] + " < " + numbers[numbers.length - 1]);
        } else {
            System.out.println(numbers[0] + " = " + numbers[numbers.length - 1]);
        }
        input.close();
    }
}
