package Java_Fundamentals.TextProcessing;

import java.util.Scanner;

public class Substrin_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToRemove = scanner.nextLine();
        String input = scanner.nextLine();

        while (input.contains(wordToRemove)){
            input = removeOccurrence(input, wordToRemove);
        }
        System.out.println(input);
    }

    private static String removeOccurrence(String input, String wordToRemove) {
        //X X I C E X
        //0 1 2 3 4 5
       int beginIndex = input.indexOf(wordToRemove);
       int endIndex = beginIndex + wordToRemove.length();
       String result = input.substring(0, beginIndex) + input.substring(endIndex);
       return result;
    }
}
