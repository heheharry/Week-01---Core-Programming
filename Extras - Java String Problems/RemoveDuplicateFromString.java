package Day1.Extras_Assignment_1;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class RemoveDuplicateFromString {
    private static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }
}
