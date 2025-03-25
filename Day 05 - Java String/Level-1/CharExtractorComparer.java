package Day5.LabPractice_L1;
import java.util.Scanner;
import java.util.Arrays;
public class CharExtractorComparer {
    public static char[] extractChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.next();
        char[] userDefinedChars = extractChars(inputString);
        char[] builtInChars = inputString.toCharArray();
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);
        System.out.println("Characters using user-defined method: " + Arrays.toString(userDefinedChars));
        System.out.println("Characters using built-in toCharArray(): " + Arrays.toString(builtInChars));
        System.out.println("Are both methods giving the same result? " + areEqual);
        input.close();
    }
}
