package Day3.LabPractice_L1;
import java.util.Scanner;
public class LP1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];
        int i ;
        for (i = 0; i < ages.length; i++){
            System.out.print("Age of " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }
        for (int age : ages){
            if (age <= 0){
                System.out.println("Invalid Age");
            }
            else if (age >= 18){
                System.out.println("Student with age " + age + " can Vote");
            }
            else{
                System.out.println("Student with age " + age + " can't Vote");
            }
        }
        input.close();
    }
}
