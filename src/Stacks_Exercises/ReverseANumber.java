package Stacks_Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> numbersReversed = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            numbersReversed.push(numbers[i]);
        }

        while (!numbersReversed.isEmpty()) {
            System.out.print(numbersReversed.pop() + " ");
        }


    }
}
