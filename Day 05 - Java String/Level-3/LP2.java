package Day5.LabPractice_L3;
import java.util.Scanner;
public class LP2 {
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }
    public static char[] findUniqueCharacters(String text) {
        int length = findStringLength(text);
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
        char[] finalUniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalUniqueChars[i] = uniqueChars[i];
        }
        return finalUniqueChars;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        char[] uniqueCharacters = findUniqueCharacters(inputText);
        System.out.println("Unique characters in the string:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
        scanner.close();
    }
}
