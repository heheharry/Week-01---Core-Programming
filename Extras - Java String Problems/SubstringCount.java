package Day1.Extras_Assignment_1;
import java.util.Scanner;
public class SubstringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String subString = scanner.nextLine();
        scanner.close();
        int count = mainString.split(subString, -1).length - 1;
        System.out.println("Occurrences: " + count);
    }
}
