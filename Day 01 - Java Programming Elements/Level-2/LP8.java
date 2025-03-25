package LabPractice_L2;
import java.util.Scanner;
public class LP8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.next();
        System.out.print("From City: ");
        String fromCity = input.next();
        System.out.print("Via City: ");
        String viaCity = input.next();
        System.out.print("To City: ");
        String toCity = input.next();
        System.out.print("Distance from to via: ");
        double distanceFromToVia = input.nextDouble();
        System.out.print("Time from to via: ");
        double timeFromToVia = input.nextDouble();
        System.out.print("Distance via to final: ");
        double distanceViaToFinal = input.nextDouble();
        System.out.print("Time via to final: ");
        double timeViaToFinal = input.nextDouble();
        double totalDiatance = distanceFromToVia + distanceViaToFinal;
        double totalTime = timeFromToVia + timeViaToFinal;
        System.out.println("The total distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDiatance + " km and the total time taken is " + totalTime + " minutes");
        input.close();
    }
}
