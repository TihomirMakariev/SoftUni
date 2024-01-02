package MethodsExercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase(); // .toLowerCase()
        printVowelsCount(text);

    }

    public static void printVowelsCount (String text){
        //TODO: a, e, i, o, u
        int count = 0; // броят на гласните букви
        for (int index = 0; index <= text.length() - 1; index++) {
            //взимаме символа -> проверка дали е гласна буква
            char currentSymbol = text.charAt(index);
            switch (currentSymbol){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count ++;
                    break;
            }
        }
        System.out.println(count);
    }
}
