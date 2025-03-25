package Day2.LabPractice_L1;
import java.util.Scanner;
public class LP3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1: ");
        int n1 = input.nextInt();
        System.out.print("Number 2: ");
        int n2 = input.nextInt();
        System.out.print("Number 3: ");
        int n3 = input.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("Is the First number the largest? YES \nIs the Second number the largest? NO \nIs the Third number the largest? NO");
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println("Is the First number the largest? NO \nIs the Second number the largest? YES \nIs the Third number the largest? NO");
        }
        else {
            System.out.println("Is the First number the largest? NO \nIs the Second number the largest? NO \nIs the Third number the largest? YES");
        }
        input.close();
    }
}
