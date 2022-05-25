package MultidimensionalArrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        int[][] matrix = new int[size][size];

        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        for (int row = 0; row < matrix.length; row++) {
            int[] numbers = Arrays
                    .stream(sc.nextLine().split("\\s"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = numbers;
        }

        for (int counter = 0; counter < matrix.length; counter++) {
            sumPrimaryDiagonal += matrix[counter][counter];
        }

        for (int row = 0; row < matrix.length; row++) {
            sumSecondaryDiagonal += matrix[row][matrix.length - 1 - row];
        }

        int diff = Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal);

        System.out.println(diff);

    }
}
