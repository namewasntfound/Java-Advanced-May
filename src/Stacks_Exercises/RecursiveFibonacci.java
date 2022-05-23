package Stacks_Exercises;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] numbers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        numbers = new long[n + 1];
        System.out.println(fib(n));
    }

    private static long fib(int n) {
        if (n < 2) {
            return 1;
        }

        if (numbers[n] != 0) {
            return numbers[n];
        }

        numbers[n] = fib(n - 1) + fib(n - 2);
        return numbers[n];
    }
}
