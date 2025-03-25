package Day2.LabPractice_L3;
import java.util.Scanner;
public class LP10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("First: ");
        int first = input.nextInt();
        System.out.print("Second: ");
        int second = input.nextInt();
        System.out.print("Operator: ");
        String op = input.next();
        switch (op){
            case "+":
                System.out.println("Output = " + (first + second));
                break;
            case "-":
                System.out.println("Output = " + (first - second));
                break;
            case "*":
                System.out.println("Output = " + (first * second));
                break;
            case "/":
                if (second != 0){
                    System.out.println("Output = " + (first / second));
                }
                else{
                    System.out.println("Enter a valid divisor");
                }
                break;
            default:
                System.out.println("Enter a valid operator");
        }
        input.close();

    }
}
