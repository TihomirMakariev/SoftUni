package Java_Fundamentals.FinalExam;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> users = new TreeMap<>();

        String command = scanner.nextLine();
        int count = 0;
        while (!command.equals("Statistics")) {
            String[] tokens = command.split("->");
            String commandName = tokens[0];
            String userName = tokens[1];


            switch (commandName) {
                case "Add":
                    count ++;
                    if (users.containsKey(userName)) {
                        System.out.printf("%s is already registered%n", userName);
                    } else {
                        users.put(userName, new ArrayList<>());
                    }
                    break;

                case "Send":
                    String emails = tokens[2];
                    users.get(userName).add(emails);
                    break;

                case "Delete":
                    count --;
                    if (users.containsKey(userName)) {
                        users.remove(userName);
                    } else {
                        System.out.printf("%s not found!%n", userName);
                    }
                    break;

            }

            command = scanner.nextLine();
        }
        System.out.printf("Users count: %d%n", count);

        users.entrySet().stream()
                .sorted((a1, a2) -> Integer.compare(a2.getValue().size(), a1.getValue().size()))
                .forEach(entry -> {

                    String user = entry.getKey();
                    System.out.println(user);

                    for (String text : entry.getValue()) {
                        System.out.printf(" - %s%n", text);
                    }
                });
    }
}
