package Java_Advanced.SetsAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        LinkedHashMap<String, String> emailBook = new LinkedHashMap<>();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();

            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com"))
                emailBook.put(name, email);

            name = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : emailBook.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        emailBook.forEach((key, value) -> System.out.println(key + value));
    }
}
