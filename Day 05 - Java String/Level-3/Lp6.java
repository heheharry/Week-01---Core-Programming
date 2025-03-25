package Day5.LabPractice_L3;
import java.util.Scanner;
public class Lp6 {
    public static String[] findCharacterFrequency(String text) {
        char[] charArray = text.toCharArray();
        int length = charArray.length;
        int[] frequency = new int[length];
        for (int i = 0; i < length; i++) {
            frequency[i] = 1;
        }
        for (int i = 0; i < length; i++) {
            if (charArray[i] == '0') {
                continue;
            }
            for (int j = i + 1; j < length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency[i]++;
                    charArray[j] = '0';
                }
            }
        }
        int count = 0;
        for (char c : charArray) {
            if (c != '0') count++;
        }
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (charArray[i] != '0') {
                result[index++] = charArray[i] + " - " + frequency[i];
            }
        }
        return result;
    }
    public static void displayFrequency(String[] frequencyTable) {
        System.out.println("\nCharacter\tFrequency");
        for (String row : frequencyTable) {
            System.out.println("   " + row.replace(" - ", "\t\t   "));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        String[] frequencyTable = findCharacterFrequency(inputText);
        displayFrequency(frequencyTable);
        scanner.close();
    }
}
