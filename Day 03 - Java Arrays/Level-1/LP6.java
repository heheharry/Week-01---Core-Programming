package Day3.LabPractice_L1;
import java.util.Scanner;
public class LP6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        for (int i = 0; i < 11; i++){
            System.out.print("Height of player " + (i + 1) + " is: ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }
        double mean = sum / 11;
        System.out.println("Mean height: " + mean);
        input.close();
    }
}
