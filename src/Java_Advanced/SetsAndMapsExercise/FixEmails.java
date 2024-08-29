package Java_Advanced.SetsAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> emailsBook = new LinkedHashMap<>();
        String name = scanner.nextLine();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();

            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                emailsBook.put(name, email);
//                System.out.printf("%s -> %s%n", name, emailsBook.get(name));
            }

            name = scanner.nextLine();
        }
        for (Map.Entry<String, String> emails : emailsBook.entrySet()) {
            System.out.println(emails.getKey() + " -> " + emails.getValue());
        }
    }
}
