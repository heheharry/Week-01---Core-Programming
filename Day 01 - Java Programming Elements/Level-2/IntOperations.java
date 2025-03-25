package LabPractice_L2;
import java.util.Scanner;
public class IntOperations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        System.out.print("c = ");
        int c = input.nextInt();
        int m = a + b * c;
        int n = a * b + c;
        int o = c + a / b;
        int p = a % b + c;
        System.out.println("The results of int operations are " + m + ", " + n + ", " + o + " and " + p);
        input.close();
    }
}
