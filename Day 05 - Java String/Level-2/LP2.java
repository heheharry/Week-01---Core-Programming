package Day5.LabPractice_L2;
import java.util.Scanner;
import java.util.Arrays;
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
    public static String[] customSplit(String text) {
        int length = findStringLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int wordIndex = 0, start = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = extractSubstring(text, start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = extractSubstring(text, start, length);
        return words;
    }
    public static String extractSubstring(String text, int start, int end) {
        StringBuilder subStr = new StringBuilder();
        for (int i = start; i < end; i++) {
            subStr.append(text.charAt(i));
        }
        return subStr.toString();
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputText = input.nextLine();
        String[] customWords = customSplit(inputText);
        String[] builtInWords = inputText.split(" ");
        boolean areEqual = compareArrays(customWords, builtInWords);
        System.out.println("\nCustom Split Method Output: " + Arrays.toString(customWords));
        System.out.println("Built-in split() Method Output: " + Arrays.toString(builtInWords));
        System.out.println("Are both methods producing the same result? " + areEqual);
        input.close();
    }
}
