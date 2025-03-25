package Day1.Extras_Assignment_1;
import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = input.next();
        char mostFrequent = findMostFrequentCharacter(string);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        input.close();
    }
    private static char findMostFrequentCharacter(String str) {
        int[] freq = new int[256];
        int maxCount = 0;
        char mostFrequentChar = ' ';
        for (char ch : str.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequentChar = ch;
            }
        }
        return mostFrequentChar;
    }
}
