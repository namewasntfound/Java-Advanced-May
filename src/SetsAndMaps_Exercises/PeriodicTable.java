package SetsAndMaps_Exercises;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        TreeSet<String> elements = new TreeSet<>();

        for (int i = 0; i < lines; i++) {
            String[] elementList = sc.nextLine().split("\\s");
            Collections.addAll(elements, elementList);
        }

        System.out.println(String.join(" ", elements));
    }
}
