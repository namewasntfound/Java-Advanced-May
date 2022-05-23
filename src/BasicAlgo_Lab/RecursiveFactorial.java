package BasicAlgo_Lab;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = Long.parseLong(sc.nextLine());

        System.out.println(fact(num));
    }

    private static long fact(long number) {
        if (number == 1) {
            return 1;
        }
        return (fact(number - 1) * number);
    }
}
