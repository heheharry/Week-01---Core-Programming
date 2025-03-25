package Day3.LabPractice_L2;
import java.util.Scanner;
public class DynamicDigitArrayMaxFinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int maxDigit = 10;
        int[] integer = new int[maxDigit];
        int index = 0;
        System.out.print("Number: ");
        long number = input.nextLong();
        while (number != 0){
            if(index == maxDigit){
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(integer, 0, temp, 0, integer.length);
                integer = temp;
            }
            integer[index++] = (int) number % 10;
            number /= 10;
        }
        int largest = 0, secLargest = 0;
        for (int i = 0; i < index; i++){
            if(integer[i] > largest){
                secLargest = largest;
                largest = integer[i];
            }
            else if (integer[i] > secLargest && integer[i] != largest) {
                secLargest = integer[i];
            }
        }
        System.out.println("Largest: " + largest + "\nSecond Largest: " + secLargest);
        input.close();
    }
}
