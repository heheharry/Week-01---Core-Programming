package Day5.LabPractice_L3;
import java.util.Scanner;
public class LP8 {
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        int[] charFrequency1 = new int[256];
        int[] charFrequency2 = new int[256];
        for (int i = 0; i < text1.length(); i++) {
            charFrequency1[text1.charAt(i)]++;
            charFrequency2[text2.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (charFrequency1[i] != charFrequency2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String input1 = scanner.nextLine().toLowerCase();
        System.out.print("Enter second string: ");
        String input2 = scanner.nextLine().toLowerCase();
        boolean result = areAnagrams(input1.replaceAll("\\s", ""), input2.replaceAll("\\s", "")); // Removing spaces

        if (result) {
            System.out.println("The given texts are anagrams.");
        } else {
            System.out.println("The given texts are NOT anagrams.");
        }
        scanner.close();
    }
}
