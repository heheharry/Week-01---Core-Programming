package Day5.LabPractice_L1;
import java.util.Scanner;
public class StringEqualityChecker {
    public static boolean charAt(String stringA, String stringB){
        if (stringA.length() != stringB.length()){
            return false;
        }
        for (int i = 0; i < stringA.length(); i++){
            if (stringA.charAt(i) != stringB.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String A: ");
        String stringA = input.next();
        System.out.print("Enter String B: ");
        String stringB = input.next();
        boolean charAtComparision = charAt(stringA, stringB);
        boolean equalsComparision = stringA.equals(stringB);
        System.out.println("\nComparison using charAt(): " + charAtComparision);
        System.out.println("Comparison using equals(): " + equalsComparision);
        if(charAtComparision == equalsComparision){
            System.out.println("Both methods produce the same result.");
        }
        else{
            System.out.println("Methods produce different results.");
        }
        input.close();
    }
}
