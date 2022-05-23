package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            int[] numbers = Arrays
                    .stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            matrix[i] = numbers;
        }

        int numberToSearch = Integer.parseInt(sc.nextLine());

        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == numberToSearch) {
                    isFound = true;
                    System.out.print(row + " " + col);
                    System.out.println();
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }

    }
}
