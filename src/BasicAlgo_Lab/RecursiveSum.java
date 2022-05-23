package BasicAlgo_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        System.out.println(sum(numbers, numbers.length));

    }

    private static int sum(int[] numbers, int length) {
        if (length <= 0) {
            return 0;
        }
        return (sum(numbers, length - 1) + numbers[length - 1]);
    }
}
