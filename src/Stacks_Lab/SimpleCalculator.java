package Stacks_Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<String> stack = new ArrayDeque<>();

        String[] tokens = sc.nextLine().split("\\s+");
        Collections.addAll(stack, tokens);

        while (stack.size() > 1) {
            int firstNumber = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());
            switch (operator) {
                case "+":
                    stack.push(String.valueOf(firstNumber + secondNumber));
                    break;
                case "-":
                    stack.push(String.valueOf(firstNumber - secondNumber));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}
