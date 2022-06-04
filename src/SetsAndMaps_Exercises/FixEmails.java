package SetsAndMaps_Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emailCollection = new LinkedHashMap<>();

        String name = scanner.nextLine();

        while (!"stop".equals(name)) {
            String email = scanner.nextLine();
            if (!(email.endsWith("us") || email.endsWith("com") || email.endsWith("uk"))) {
                emailCollection.put(name, email);
            }
            name = scanner.nextLine();
        }
        emailCollection.forEach(
                (fullName, email) -> System.out.printf("%s -> %s%n", fullName, email));
    }
}
