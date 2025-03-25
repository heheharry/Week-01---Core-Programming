package LabPractice_L1;

public class LP7 {
    public static void main(String[] args){
        double ROEKM = 6378;
        double ROEM = ROEKM * 0.621371;
        double VOSKM = (4.0/3.0) * 3.14 * (ROEKM * ROEKM * ROEKM);
        double VOSM = (4.0/3.0) * Math.PI * Math.pow(ROEM, 3);
        System.out.println("The volume of earth in cubic kilometers is " + VOSKM + " and cubic miles is " + VOSM);
    }
}
