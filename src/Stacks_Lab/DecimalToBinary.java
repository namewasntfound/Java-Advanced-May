package Stacks_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> numberStack = new ArrayDeque<>();
        int decimal = Integer.parseInt(sc.nextLine());

        if (decimal != 0) {
            while (decimal != 0) {
                numberStack.push(decimal % 2);
                decimal /= 2;
            }
            while (!numberStack.isEmpty()) {
                System.out.print(numberStack.pop());
                System.out.println();
            }
        } else {
            System.out.println(decimal);
        }

    }
}
