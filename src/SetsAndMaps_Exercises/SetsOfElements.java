package SetsAndMaps_Exercises;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sizes = Arrays
                .stream(sc.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = sizes[0];
        int m = sizes[1];


        Set<String> nSet = new LinkedHashSet<>();
        Set<String> mSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            nSet.add(sc.nextLine());
        }

        for (int i = 0; i < m; i++) {
            mSet.add(sc.nextLine());
        }

        nSet.retainAll(mSet);

        System.out.println(String.join(" ", nSet));

    }
}
