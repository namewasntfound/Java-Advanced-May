package SetsAndMaps_Exercises;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HandsOfCards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, HashSet<String>> players = new LinkedHashMap<>();

        while (!"JOKER".equals(input)) {
            String[] data = input.split(":\\s");
            String name = data[0];
            String[] cards = data[1].split(", ");

            if (!players.containsKey(name)) {
                players.put(name, new HashSet<>());
            }

            for (String card : cards) {
                players.get(name).add(card);
            }

            input = scanner.nextLine();
        }

    }

}
