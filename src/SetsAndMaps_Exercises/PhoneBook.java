package SetsAndMaps_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"search".equals(input)) {
            String[] data = input.split("-");
            String name = data[0];
            String phone = data[1];

            phoneBook.put(name, phone);

            input = scanner.nextLine();
        }

        String name = scanner.nextLine();

        while (!"stop".equals(name)) {
            if (phoneBook.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, phoneBook.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
            name = scanner.nextLine();
        }
    }
}
