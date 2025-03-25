package Day3.LabPractice_L1;
import java.util.Scanner;
public class MatrixToOneDArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = input.nextInt();
        System.out.print("Columns: ");
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the Matrix elements: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        int[] oneDArray = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                oneDArray[index] = matrix[i][j];
                index++;
            }
        }
        System.out.println("2D Array: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(" ");
        }
        System.out.println("\n1D Array: ");
        for (int i = 0; i < oneDArray.length; i++){
            System.out.print(oneDArray[i] + " ");
        }
        input.close();
    }
}
