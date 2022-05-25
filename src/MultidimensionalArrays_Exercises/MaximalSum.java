package MultidimensionalArrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimensions = Arrays
                .stream(sc.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            int[] numberRow = Arrays
                    .stream(sc.nextLine().split("\\s"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = numberRow;
        }

        int bestRowStart = -1;
        int bestColStart = -1;
        int bestSum = Integer.MIN_VALUE;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (sum > bestSum) {
                    bestSum = sum;
                    bestRowStart = row;
                    bestColStart = col;
                }
            }
        }

        System.out.printf("Sum = %d%n", bestSum);

        for (int row = bestRowStart; row < bestRowStart + 3; row++) {
            for (int col = bestColStart; col < bestColStart + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
