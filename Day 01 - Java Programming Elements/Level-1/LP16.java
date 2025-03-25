package LabPractice_L1;
import java.util.Scanner;
public class LP16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Students: ");
        int numberOfStudents = input.nextInt();
        int handshakePossible = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The number of handshakes possible are " + handshakePossible);
        input.close();
    }
}
