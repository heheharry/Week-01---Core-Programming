package Day2.LabPractice_L2;
import java.util.Scanner;
public class LP10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        if (number <= 1){
            System.out.println("Enter a valid number!");
        }
        else{
            int counter = number - 1;
            int GF = 1;
            while (counter != 1){
                if (number % counter == 0){
                    GF = counter;
                    break;
                }
                counter--;
            }
            System.out.println("Greatest Factor of " + number + " is " + GF);
        }
        input.close();
    }
}
