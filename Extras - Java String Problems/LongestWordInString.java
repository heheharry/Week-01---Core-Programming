package Day1.Extras_Assignment_1;
import java.util.Scanner;
public class LongestWordInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        String longest = "";
        for (String word : sentence.split(" ")) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest word: " + longest);
    }
}
