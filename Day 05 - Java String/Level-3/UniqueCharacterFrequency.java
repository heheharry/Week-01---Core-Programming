package Day5.LabPractice_L3;
import java.util.Scanner;
public class UniqueCharacterFrequency {
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }
    public static String[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(charFrequency[uniqueChars[i]]);
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
