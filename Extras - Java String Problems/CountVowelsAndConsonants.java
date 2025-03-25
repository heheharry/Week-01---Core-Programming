package Day1.Extras_Assignment_1;
import java.util.Scanner;
public class CountVowelsAndConsonants {
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = input.next();
        int vowelCount = 0, consonantCount = 0;
        for(char ch : string.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)){
                if(isVowel(ch)){
                    vowelCount++;
                }
                else{
                    consonantCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        input.close();
    }
}