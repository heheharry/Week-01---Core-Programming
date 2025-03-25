package Day4.LabPractice_L3;
import java.util.Scanner;
import java.util.Random;
public class LP1 {
    public static int[] generateRandomHeights() {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        return heights;
    }
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }
    public static int findShortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }
    public static int findTallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = generateRandomHeights();

        System.out.print("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        System.out.println("Shortest Player Height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest Player Height: " + findTallestHeight(heights) + " cm");
        System.out.println("Mean Height: " + findMeanHeight(heights) + " cm");
    }
}
