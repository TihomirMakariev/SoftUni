package AssociativeArraysExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> userAndPoints = new HashMap<>();
        Map<String, Integer> languageCount = new HashMap<>();


        while (!input.equals("exam finished")) {
            String[] splitArray = input.split("-");
            //"{username}-{language}-{points}"
            //"{username}-banned"
            String currentUsername = splitArray[0];
            if (splitArray.length == 3) {
                String currentLanguage = splitArray[1];
                int points = Integer.parseInt(splitArray[2]);
                //добавяме Username И точки;
                if (!userAndPoints.containsKey(currentUsername)) {
                    userAndPoints.put(currentUsername, points);
                } else {
                    int currentPoints = userAndPoints.get(currentUsername);
                    if (points > currentPoints){
                        userAndPoints.put(currentUsername, + points);
                    }
                }
                //добавяме брой срещания на езика
                if (!languageCount.containsKey(currentLanguage)){
                    languageCount.put(currentLanguage, 1);
                } else {
                    languageCount.put(currentLanguage, languageCount.get(currentLanguage) +1);
                }

            } else {
                userAndPoints.remove(currentUsername);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userAndPoints.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e-> System.out.println(e.getKey() + " | " + e.getValue()));
        System.out.println("Submissions:");
        languageCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e-> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
