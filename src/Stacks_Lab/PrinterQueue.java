package Stacks_Lab;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> printer = new ArrayDeque<>();
        String input = sc.nextLine();

        while (!"print".equals(input)) {
            if ("cancel".equals(input)) {
                if (printer.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s%n", printer.poll());
                }
            } else {
                printer.offer(input);
            }
            input = sc.nextLine();
        }

        printer.stream().iterator().forEachRemaining(System.out::println);
    }
}
