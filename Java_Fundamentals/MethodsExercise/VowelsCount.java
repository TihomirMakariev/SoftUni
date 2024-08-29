package Java_Fundamentals.MethodsExercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        printVowelsCount(input);
        System.out.println();

    }

    public static void printVowelsCount(String input) {

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            switch (currentSymbol) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count ++;
                    break;
            }
        }
        // Още един вариант на решение на задачата
        /*for (int i = 0; i <= input.length() - 1; i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }*/

        System.out.println(count);

    }
}
