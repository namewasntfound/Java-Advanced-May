package MultidimensionalArrays_Exercises;

import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] patternAndSize = sc.nextLine().split(", ");
        int size = Integer.parseInt(patternAndSize[0]);
        String pattern = patternAndSize[1];

        int[][] matrix = new int[size][size];

        if (pattern.equals("A")) {
            fillPatternA(matrix);
        } else if (pattern.equals("B")) {
            fillPatternB(matrix);
        }

        printMatrix(matrix);
    }

    private static void fillPatternA(int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = counter++;
            }
        }
    }

    private static void fillPatternB(int[][] matrix) {
        int counter = 1;

        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = counter++;
                }
            }
        }

    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%d ", matrix[row][col]);
            }
            System.out.println();
        }
    }
}
