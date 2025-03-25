package Day2.LabPractice_L1;
import java.util.Scanner;
public class VotingEligibilityChecker {
    public static void main(String[] argss){
        Scanner input = new Scanner(System.in);
        System.out.print("Age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote");
        }
        else {
            System.out.println("The person's age is " + age + " and cannot vote");
        }
        input.close();
    }
}
