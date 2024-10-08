package Java_Fundamentals.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03_1_Arrays_Stream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)) // (Integer::parseInt(e))
                .toArray();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                sum += numbers[i];
        }
        System.out.println(sum);
    }
}
