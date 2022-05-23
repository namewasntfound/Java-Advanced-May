package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimensions = Arrays
                .stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        System.out.println(rows);
        System.out.println(cols);

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            int[] numbers = Arrays
                    .stream(sc.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int sumRow = Arrays.stream(numbers).sum();
            sum += sumRow;
        }

        System.out.println(sum);
    }
}
