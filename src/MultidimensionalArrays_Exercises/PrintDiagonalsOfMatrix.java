package MultidimensionalArrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < numbers.length; j++) {
                matrix[i][j] = numbers[j];
            }
        }

        for (int row = 0; row <= matrix.length - 1; row++) {
            if (row == 0) {
                System.out.print(matrix[row][row] + " ");
            }
            System.out.print(matrix[row][row + 1] + " ");
        }
    }
}
