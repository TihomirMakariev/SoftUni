package Java_Fundamentals.MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ПРочитане на паролата от потребителя
        String password = scanner.nextLine();

        // Проверка за валидността на паролата
        boolean isValid = true;

        if (!isLengthValid(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        if (!validateLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
            isValid = false;
        }

        if (!hasAtLeastTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isLengthValid(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean validateLettersAndDigits(String password) {
        return password.matches("[a-zA-Z0-9]+");
    }

    public static boolean hasAtLeastTwoDigits(String password) {
        int dijitCount = 0;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                dijitCount++;
            }
        }

        return dijitCount >= 2;
    }

}
