package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^([$%])(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<first>\\d+)\\]\\|\\[(?<second>\\d+)\\]\\|\\[(?<third>\\d+)\\]\\|$";
        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher match = pattern.matcher(input);
            if (!match.find()) {
                System.out.println("Valid message not found!");
                continue;
            }
            String tag = match.group("tag");
            char charOne = (char) Integer.parseInt(match.group("first"));
            char charTwo = (char) Integer.parseInt(match.group("second"));
            char charThree = (char) Integer.parseInt(match.group("third"));
            System.out.printf("%s: %c%c%c\n", tag, charOne, charTwo, charThree);
        }

    }
}
