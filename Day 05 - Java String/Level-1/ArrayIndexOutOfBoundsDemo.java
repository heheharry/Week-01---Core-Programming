package Day5.LabPractice_L1;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names, int index) {
        System.out.println("Attempting to access index: " + index);
        System.out.println("Name at index " + index + ": " + names[index]);
    }
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Attempting to access index: " + index);
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emma"};
        System.out.print("Enter an index to access (0 to " + (names.length - 1) + "): ");
        int index = input.nextInt();
        handleException(names, index);
        input.close();
    }
}
