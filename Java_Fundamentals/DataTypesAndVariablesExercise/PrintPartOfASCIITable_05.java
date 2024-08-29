package Java_Fundamentals.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int starIndex = Integer.parseInt(scanner.nextLine());
        int endIndex = Integer.parseInt(scanner.nextLine());


        for (int i = starIndex; i <= endIndex ; i++) {
            System.out.print((char) i + " ");
        }
    }
}
