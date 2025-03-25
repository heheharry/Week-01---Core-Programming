package Day4.LabPractice_L3;
import java.util.Random;
public class LP11 {
    public static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] employeeData = new int[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000);
            employeeData[i][1] = random.nextInt(11);
        }
        return employeeData;
    }
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02; // 5% if >5 years, else 2%
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
        }
        return updatedData;
    }
    public static void displaySummary(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-5s %-10s %-15s %-10s %-15s %-10s%n",
                "ID", "Salary", "Years of Service", "Bonus", "New Salary", "Total Bonus");
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double newSalary = updatedData[i][0];
            double bonus = updatedData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-5d %-10d %-15d %-10.2f %-15.2f %-10.2f%n",
                    (i + 1), oldSalary, yearsOfService, bonus, newSalary, totalBonus);
        }

        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-17s %-10.2f %-10s %-10.2f %-15s %-10.2f%n",
                "Total Old Salary:", totalOldSalary, "Total Bonus:", totalBonus, "Total New Salary:", totalNewSalary);
        System.out.println("---------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, updatedData);
    }
}
