package Day5.LabPractice_L2;
import java.util.Scanner;
public class LP3 {
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
    public static String[][] getWordsWithLengths(String[] words) {
        int numWords = words.length;
        String[][] wordLengths = new String[numWords][2];
        for (int i = 0; i < numWords; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordLengths;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();
        String[] words = customSplit(inputText);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        System.out.println("\nWord\t\tLength");
        for (String[] row : wordsWithLengths) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }
        scanner.close();
    }
}
