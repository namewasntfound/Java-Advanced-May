package MultidimensionalArrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    static String errorMessage = "Invalid input!";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimensions = Arrays
                .stream(sc.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String[] numberRow = sc.nextLine().split(" ");
            matrix[row] = numberRow;
        }

        String input = sc.nextLine();

        while (!"END".equals(input)) {
            String[] data = input.split("\\s");
            if (!"swap".equals(data[0]) || data.length != 5) {
                System.out.println(errorMessage);
                input = sc.nextLine();
                continue;
            }

            int row1 = Integer.parseInt(data[1]);
            int col1 = Integer.parseInt(data[2]);
            int row2 = Integer.parseInt(data[3]);
            int col2 = Integer.parseInt(data[4]);

            try {
                String temp = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = temp;
                printMatrix(matrix);
            } catch (ArrayIndexOutOfBoundsException aiob) {
                System.out.println(errorMessage);
            }
            input = sc.nextLine();
        }
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
