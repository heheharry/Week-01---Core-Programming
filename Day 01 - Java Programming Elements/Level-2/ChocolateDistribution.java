package LabPractice_L2;
import  java.util.Scanner;
public class ChocolateDistribution {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Students: ");
        int noOfStudents = input.nextInt();
        System.out.print("Number of Chocolates: ");
        int noOfChocolates = input.nextInt();
        int remChoc = noOfChocolates % noOfStudents;
        int chocFordistribution = noOfChocolates - remChoc;
        System.out.println("The number of chocolates each child gets is " + (chocFordistribution / noOfStudents) + " and the number of remaining chocolates are " + remChoc);
        input.close();
    }
}
