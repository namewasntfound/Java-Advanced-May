package Stacks_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParantheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = sc.nextLine().toCharArray();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean isValid = true;

        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                isValid = false;
                break;
            }
        }

        System.out.println(isValid ? "YES" : "NO");

    }

}
