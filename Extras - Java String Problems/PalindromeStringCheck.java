package Day1.Extras_Assignment_1;
import java.util.Scanner;
public class PalindromeStringCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = input.next();
        String reversed = "";
        for(int i = string.length() - 1; i >= 0; i--){
            reversed += string.charAt(i);
        }
        if(string.equals(reversed)){
            System.out.println("Is Palindrome");
        }
        else{
            System.out.println("Is Not Palindrome");
        }
        input.close();
    }
}
