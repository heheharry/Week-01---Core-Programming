package Day2.LabPractice_L2;
import java.util.Scanner;
public class YoungestTallestFriendFinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Age of Amar: ");
        int aa = input.nextInt();
        System.out.print("Height of Amar: ");
        int ha = input.nextInt();
        System.out.print("Age of Akbar: ");
        int ab = input.nextInt();
        System.out.print("Height of Akbar: ");
        int hb = input.nextInt();
        System.out.print("Age of Antony: ");
        int ac = input.nextInt();
        System.out.print("Height of Antony: ");
        int hc = input.nextInt();
        int youngest = Math.min(aa, Math.min(ab, ac));
        int tallest = Math.max(ha, Math.max(hb, hc));

        /*String youngFriend = (youngest == aa) ? "A" : (youngest == ab) ? "B" : "C";
        String tallestFriend = (tallest == ha) ? "A" : (tallest == hb) ? "B" : "C";
        System.out.println("Youngest = " + youngFriend + " = " + youngest);
        System.out.println("Tallest = " + tallestFriend + " = " + tallest);*/

        System.out.print("Youngest friends is/are: ");
        if (youngest == aa) System.out.print("Amar, ");
        if (youngest == ab) System.out.print("Akbar, ");
        if (youngest == ac) System.out.print("Antony, ");
        System.out.println("With age of " + youngest);
        System.out.print("Tallest friends is/are: ");
        if (tallest == ha) System.out.print("Amar, ");
        if (tallest == hb) System.out.print("Akbar, ");
        if (tallest == hc) System.out.print("Antony, ");
        System.out.println("With height of " + tallest);
        input.close();
    }
}
