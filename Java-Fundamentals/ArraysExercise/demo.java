package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//3, 4, 5, 6, 7, 8
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e)).toArray();
        int countRotation = Integer.parseInt(scanner.nextLine());

        //[51, 47, 32, 61, 21]
        for (int rotation = 1; rotation <=countRotation ; rotation++) {
            int firstNumber = numbers[0];
            for (int index = 0; index < numbers.length; index++) {
                numbers[index] = numbers[index + 1];
                System.out.println();
            }
            numbers[numbers.length - 1] = firstNumber;

        }

    }
}
