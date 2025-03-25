package Day1.Extras_Assignment_1;
import java.util.Scanner;
public class RemoveCharacter {
    private static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.next().charAt(0);
        scanner.close();
        String modifiedString = removeCharacter(input, toRemove);
        System.out.println("Modified String: " + modifiedString);
        scanner.close();
    }

}
