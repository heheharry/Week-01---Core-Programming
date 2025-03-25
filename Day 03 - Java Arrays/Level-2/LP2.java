package Day3.LabPractice_L2;
import java.util.Scanner;
public class LP2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] friends = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++){
            System.out.println("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();
            System.out.println("Enter height of " + friends[i] + ": ");
            heights[i] = input.nextDouble();
        }
        int minAge = ages[0];
        String youngest = friends[0];
        for (int i = 1; i < 3; i++){
            if(ages[i] < minAge){
                minAge = ages[i];
                youngest = friends[i];
            }
            else if (minAge == ages[i]){
                youngest += " & " + friends[i];
            }
        }
        double maxHeight = heights[0];
        String tallest = friends[0];
        for (int i = 1; i < 3; i++){
            if(heights[i] > maxHeight){
                maxHeight = heights[i];
                tallest = friends[i];
            }
            else if(heights[i] == maxHeight){
                tallest += " & " + friends[i];
            }
        }
        System.out.println("Youngest: " + youngest + "\nTallest: " + tallest);
        input.close();
    }
}
