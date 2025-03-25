package Day2.LabPractice_L3;
import java.util.Scanner;
public class LP1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Year: ");
        int year = input.nextInt();
        if(year <= 1582){
            System.out.println("Enter year above 1582!");
        }
        else{
            if(year % 400 == 0){
                System.out.println(year + " is a leap year");
            }
            else if (year % 100 == 0){
                System.out.println(year + " is not a leap year");
            }
            else if (year % 4 == 0){
                System.out.println(year + " is a leap year");
            }
            else {
                System.out.println(year + " is not a leap year");
            }
        }
        input.close();
    }
}
