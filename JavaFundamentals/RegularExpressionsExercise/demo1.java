package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String emailRegex = "([A-Za-z]+)@([A-Za-z]+).([A-Za-z]+)";

        Pattern regex = Pattern.compile(emailRegex);
        for (int i = 0; i < 10; i++) {
            String email = scanner.nextLine();
            Matcher matcher = regex.matcher(email);
            if (matcher.find()) {
                System.out.println("valid email");
                System.out.println("Username: " + matcher.group(1));
            }
        }
    }
}
