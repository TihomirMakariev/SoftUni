package Java_Fundamentals.MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        String repeatedText = getRepeatString(text, repeatCount);
        System.out.println(repeatedText);
    }

    private static String getRepeatString(String text, int repeatCount) {
        String repeatedText = "";

        for (int i = 0; i < repeatCount; i++) {
          repeatedText = repeatedText + text;
        }

        return repeatedText;
    }
}
