package Java_Fundamentals.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03_2_Arrays_Stream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(e->Integer.parseInt(e)).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbers) {
            if (number % 2 == 0){
                evenSum +=number;
            } else {
                oddSum +=number;
            }
        }
        int result = evenSum - oddSum;
        System.out.println(result);
    }
}
