package Stacks_Exercises;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < lines; i++) {
            String[] commands = sc.nextLine().split("\\s+");

            switch (commands[0]) {
                case "1":
                    int elementToPush = Integer.parseInt(commands[1]);
                    stack.push(elementToPush);
                    break;
                case "2":
                    stack.remove();
                    break;
                case "3":
                    int maxElement = stack.stream().mapToInt(Integer::intValue).max().orElse(0);
                    System.out.println(maxElement);
                    break;
            }
        }
    }
}
