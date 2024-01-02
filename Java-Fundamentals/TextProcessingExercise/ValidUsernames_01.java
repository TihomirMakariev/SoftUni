package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //"sh, too_long_username, !lleg@l ch@rs, jeffbutt"
        String[] usernames = text.split(", ");
        //["sh", "too_long_username", "!lleg@l ch@rs", "jeffbutt"]

        for (String username : usernames) {
            //ако е валиден -> печатаме го
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    static boolean isValidUsername(String username) {
        //•   Has length between 3 and 16 characters -> [3;16]

        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        //•   Contains only letters, numbers, hyphens and underscores -> "Pesho"
        for (int index = 0; index <= username.length() - 1; index++) {
            char currentSymbol = username.charAt(index);
            if (!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_') {
                return false;
            }
        }

        return true;
    }
}
