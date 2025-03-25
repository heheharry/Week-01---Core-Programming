package Day5.LabPractice_L3;
import java.util.Scanner;
public class CharacterFrequencyMap {
    public static String[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCount++;
            }
        }
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(charFrequency[i]);
                index++;
            }
        }
        return result;
    }
    public static void displayFrequency(String[][] frequencyTable) {
        System.out.println("\nCharacter\tFrequency");
        for (String[] row : frequencyTable) {
            System.out.println("   " + row[0] + "\t\t   " + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        String[][] frequencyTable = findCharacterFrequency(inputText);
        displayFrequency(frequencyTable);
        scanner.close();
    }
}
