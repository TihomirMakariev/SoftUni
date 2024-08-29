package Java_Fundamentals.MethodsLab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repetition = Integer.parseInt(scanner.nextLine());

        String repeatText = repeatString(text, repetition);
        System.out.print(repeatText);

    }

    private static String repeatString(String text, int repetition) {
        String result = "";
        for (int i = 0; i < repetition; i++) {
            result = result + text;

        }
        return result;
    }
}
