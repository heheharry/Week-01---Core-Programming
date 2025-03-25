package Day4.LabPractice_L1;
import java.util.Scanner;
public class LP4 {
    public static int calcRounds(int a, int b, int c){
        int perimeter = a + b + c;
        return (5000 / perimeter);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Side A: ");
        int a = input.nextInt();
        System.out.print("Side B: ");
        int b = input.nextInt();
        System.out.print("Side C: ");
        int c = input.nextInt();
        if (a + b > c && b + c > a && a + c > b){
            int rounds = calcRounds(a, b, c);
            System.out.println("Rounds: " + rounds);
        }
        else{
            System.out.println("Enter valid Triangle Sides!");
        }
        input.close();
    }
}
