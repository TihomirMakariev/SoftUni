package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        printMiddleCharacter(word);
    }

    static void printMiddleCharacter(String text) {
        if (text.length() % 2 == 1) {
            System.out.println(text.charAt(text.length() / 2));
        } else {
            char symbol1 = text.charAt(text.length() / 2 - 1);
            char symbol2 = text.charAt(text.length() / 2);
            System.out.printf("%c%c", symbol1, symbol2);
        }
    }
}
