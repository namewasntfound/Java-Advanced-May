package SetsAndMaps_Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        LinkedHashSet<String> uniqueUsernames = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String username = sc.nextLine();
            uniqueUsernames.add(username);
        }

        uniqueUsernames.forEach(System.out::println);

    }
}
