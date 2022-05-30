package SetsAndMaps_Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (!symbols.containsKey(symbol)) {
                symbols.put(symbol, 1);
            } else {
                symbols.put(symbol, symbols.get(symbol) + 1);
            }
        }

        for (Map.Entry<Character, Integer> symbolPairs : symbols.entrySet()) {
            System.out.printf("%c: %d time/s%n", symbolPairs.getKey(), symbolPairs.getValue());
        }
    }
}
