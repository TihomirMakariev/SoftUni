package Java_Fundamentals.MethodsExercise;

import java.util.Scanner;

public class CharactersRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startSymbol = scanner.nextLine().charAt(0);
        char endSymbol = scanner.nextLine().charAt(0);
        printSymbolInRange(startSymbol, endSymbol);
    }

    private static void printSymbolInRange(char start, char end) {
        if (start < end) {
            for (int ascii = start + 1; ascii <= end - 1; ascii++) {
                System.out.print((char) ascii + " ");
            }
        } else {
            for (int ascii = end + 1; ascii <= start - 1; ascii++) {
                System.out.print((char) ascii + " ");
            }
        }
    }
}
