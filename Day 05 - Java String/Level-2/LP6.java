package Day5.LabPractice_L2;
import java.util.Scanner;
public class LP6 {
    public static String classifyCharacter(char ch) {
        ch = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static String[][] analyzeString(String text) {
        int length = text.length();
        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = classifyCharacter(ch);
        }
        return result;
    }
    public static void displayResult(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("--------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        String[][] classifiedData = analyzeString(inputText);
        displayResult(classifiedData);
        scanner.close();
    }
}
