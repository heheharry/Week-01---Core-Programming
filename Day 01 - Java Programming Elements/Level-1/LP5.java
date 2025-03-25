package LabPractice_L1;

public class LP5 {
    public static void main(String[] args){
        int pens = 14;
        int students = 3;
        int nonDistribute = 14 % 3;
        int Distribute = pens - nonDistribute;
        int penPerStudent = Distribute / 3;
        System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + nonDistribute);
    }
}
