package Day2.LabPractice_L3;
import java.util.Scanner;
public class LP7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Weight: ");
        double w = input.nextDouble();
        System.out.print("Height: ");
        double h = input.nextDouble();
        double height = h / 100;
        double BMI = w / (height * height);
        if (BMI <= 18.4){
            System.out.println("Under Weight");
        }
        else if (BMI >= 18.5 && BMI <= 24.9){
            System.out.println("Normal");
        }
        else if (BMI >= 25 && BMI <= 39.9){
            System.out.println("Over Weight");
        }
        else if (BMI >= 40){
            System.out.println("Obese");
        }
        input.close();
    }
}
