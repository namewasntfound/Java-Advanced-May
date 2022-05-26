package MultidimensionalArrays_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> words = new ArrayList<>();

        String rotation = sc.nextLine();
        String rotationDegree = rotation.split("[()]")[1];

        String input = sc.nextLine();
        int longestLength = Integer.MIN_VALUE;

        while (!"END".equals(input)) {
            words.add(input);
            if (input.length() > longestLength) {
                longestLength = input.length();
            }
            input = sc.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix, String rotationDegree) {
        switch (rotationDegree) {
            case "0":

        }
    }
}
