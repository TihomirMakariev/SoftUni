package Java_Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        StringBuilder encryptSentence = new StringBuilder();

        for (int i = 0; i <= sentence.length() - 1; i++) {
            char currentSymbol = sentence.charAt(i);
            encryptSentence.append((char) (currentSymbol + 3));
        }
        System.out.println(encryptSentence);
    }
}
