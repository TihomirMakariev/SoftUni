package TextProcessing;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        for (String word : words) {

            String repeatedWord = repeatWord(word, word.length());
            System.out.print(repeatedWord);

        }
    }

    private static String repeatWord(String word, int numberOFRepetitions) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOFRepetitions; i++) {
            result.append(word);
        }
        return result.toString();


    }
}
