package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0;
        String input = scanner.nextLine();
        //A12b s17G
        String[] words = input.split("\\s+");
        //["A12b", "s17G"]
        for (String word : words) {
            //изчисляваме колко сме спечелили от думата
            double sumOfWord = getWordSum(word);
            totalSum += sumOfWord;
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getWordSum(String word) {
        //"A12b"
        double result = 0;
        char firstLetter = word.charAt(0); //A
        char secondLetter = word.charAt(word.length() - 1);//b
        double number = Double.parseDouble(word.substring(1, word.length() - 1));//"12"

        //първата буква
        if (Character.isUpperCase(firstLetter)) {
            //number / позиция на символа в азбука
            result = number / (firstLetter - 64);
            number = result;
        } else if (Character.isLowerCase(firstLetter)) {
            result = number * (firstLetter - 96);
            number = result;
        }

        //втората буква
        if (Character.isUpperCase(secondLetter)) {
            result = number - (secondLetter - 64);
            number = result;
        } else if (Character.isLowerCase(secondLetter)) {
            result = number + (secondLetter - 96);
            number = result;
        }

        return result;
    }
}
