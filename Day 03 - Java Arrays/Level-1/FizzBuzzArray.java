package Day3.LabPractice_L1;
import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        String[] results = new String[number + 1];
        if (number <= 0){
            System.out.print("Enter a valid number!");
        }
        else{
            for (int i = 1; i <= number; i++){
                if (i % 3 == 0 && i % 5 == 0){
                    results[i] = "FizzBuzz";
                }
                else if (i % 3 == 0){
                    results[i] = "Fizz";
                }
                else if (i % 5 == 0){
                    results[i] = "Buzz";
                }
                else{
                    results[i] = String.valueOf(i);
                }
            }
            for (int i = 1; i <= number; i++){
                System.out.println("Index Position " + i + " = " + results[i]);
            }
        }
        input.close();
    }
}
