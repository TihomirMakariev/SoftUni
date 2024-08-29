package Java_Fundamentals.FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "([^\\s]+)>(\\d{3})\\|([a-z]{3})\\|([A-Z]{3})\\|([^<>]{3})<\\1";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String string = scanner.nextLine();
            Matcher matcher = pattern.matcher(string);

            if (matcher.find()) {
                String numbers = matcher.group(2);
                String lowerLetters = matcher.group(3);
                String upperLetters = matcher.group(4);
                String symbols = matcher.group(5);
                System.out.println("Password: " + numbers + lowerLetters + upperLetters + symbols);

            } else {
                System.out.println("Try another password!");
            }
        }

    }
}
//$$$>312|dfe|KFE|@!#<$$$
