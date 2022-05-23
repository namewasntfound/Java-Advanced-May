package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());

        char[][] firstMatrix = new char[rows][];
        char[][] secondMatrix = new char[rows][];
        char[][] thirdMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String input = sc.nextLine().replace(" ", "");
            char[] symbols = input.toCharArray();

            firstMatrix[row] = symbols;
        }

        for (int row = 0; row < rows; row++) {
            String input = sc.nextLine().replace(" ", "");
            char[] symbols = input.toCharArray();

            secondMatrix[row] = symbols;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    thirdMatrix[row][col] = firstMatrix[row][col];
                } else {
                    thirdMatrix[row][col] = '*';
                }
            }
        }
        printArray(thirdMatrix);

    }

    private static void printArray(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
