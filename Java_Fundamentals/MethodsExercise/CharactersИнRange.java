package Java_Fundamentals.MethodsExercise;

import java.util.Scanner;

public class CharactersИнRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startSymbol = scanner.nextLine().charAt(0);
        char endSymbol = scanner.nextLine().charAt(0);

        printCharInRange(startSymbol, endSymbol);
    }

    public static void printCharInRange(char start, char end) {
        if (start < end) {
            for (int i = start + 1; i < end; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = end + 1; i < start; i++) {
                System.out.print((char) i + " ");
            }
        }
    }

    // Същият метод, но с различна if проверка
    /*public static void printCharInRange(char start, char end) {
       if (start > end) {
           char temp = start;
           start = end;
           end = temp;
       }

        for (int i = start + 1; i < end; i++) {
            System.out.print((char) i + " ");
        }
    }*/
}
