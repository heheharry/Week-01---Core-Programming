package Day2.LabPractice_L3;
import java.util.Scanner;
public class LP2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Year: ");
        int year = input.nextInt();
        if(year <= 1582){
            System.out.println("Enter a year above 1582");
        }
        else{
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year + " is a leap year");
            }
            else{
                System.out.println(year + " is not a leap year");
            }
        }
        input.close();
    }
}
