package Stacks_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayDeque<String> stack = new ArrayDeque<>();

        String output = "";

        for (int i = 0; i < n; i++) {
            String[] commands = sc.nextLine().split("\\s+");
            switch (commands[0]) {
                case "1": {
                    String s = commands[1];
                    StringBuilder temp = new StringBuilder(output);
                    temp.append(s);
                    output = temp.toString();
                    stack.push(output);
                    break;
                }
                case "2": {
                    int count = Integer.parseInt(commands[1]);
                    StringBuilder temp = new StringBuilder(output);
                    temp.setLength(temp.length() - count);
                    output = temp.toString();
                    stack.push(output);
                    break;
                }
                case "3":
                    int index = Integer.parseInt(commands[1]);
                    System.out.println(output.charAt(index - 1));
                    break;
                case "4":
                    stack.pop();
                    output = stack.peek();
                    break;
            }
        }
    }
}
