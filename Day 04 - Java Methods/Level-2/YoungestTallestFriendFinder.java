package Day4.LabPractice_L2;
import java.util.Scanner;
public class YoungestTallestFriendFinder {
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        StringBuilder youngestFriends = new StringBuilder(names[0]);

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestFriends = new StringBuilder(names[i]); // Reset if new min found
            } else if (ages[i] == minAge) {
                youngestFriends.append(", ").append(names[i]); // Append if tie
            }
        }
        return youngestFriends.toString();
    }

    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        StringBuilder tallestFriends = new StringBuilder(names[0]);

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestFriends = new StringBuilder(names[i]);
            } else if (heights[i] == maxHeight) {
                tallestFriends.append(", ").append(names[i]);
            }
        }
        return tallestFriends.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }
        System.out.println("The youngest friend is: " + findYoungest(names, ages));
        System.out.println("The tallest friend is: " + findTallest(names, heights));
        input.close();
    }
}
