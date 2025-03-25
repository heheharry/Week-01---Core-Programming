package Day4.LabPractice_L1;
import java.util.Scanner;
public class LP2 {
    public static int handshakes(int n){
        return  (n * (n - 1)) / 2;
    }

    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int n = input.nextInt();
        int noOfHandshakes = handshakes(n);
        System.out.println("Handshakes: " + noOfHandshakes);
        input.close();
    }
}
