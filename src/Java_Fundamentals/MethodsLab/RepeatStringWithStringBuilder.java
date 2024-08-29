package Java_Fundamentals.MethodsLab;

import java.util.Scanner;

public class RepeatStringWithStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        String repeatedText = getRepeatString(text, repeatCount);
        System.out.println(repeatedText);
    }

    private static String getRepeatString(String text, int repeatCount) {
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < repeatCount; i++) {
          result.append(text);
        }

        return result.toString();
    }
}
