package Day2.LabPractice_L2;
import java.util.Scanner;
public class FizzBuzzWhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        if (number <= 0){
            System.out.println("Enter a valid number!");
        }
        else{
            int i = 1;
            while (i <= number){
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0){
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0){
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
                i++;
            }
            input.close();
        }
    }
}
