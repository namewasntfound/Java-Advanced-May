package MultidimensionalArrays_Exercises;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] dimensions = sc.nextLine().split("\\s");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                char firstAndLastChar = (char) (97 + row);
                char middleChar = (char) (firstAndLastChar + col);
                matrix[row][col] = String.format("%c%c%c", firstAndLastChar, middleChar, firstAndLastChar);
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%s ", matrix[row][col]);
            }
            System.out.println();
        }
    }
}
