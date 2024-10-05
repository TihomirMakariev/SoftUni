package Java_Advanced._11_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .toArray();


//        StringBuilder out = new StringBuilder();
//
//        for (int i = 0; i < numbers.length; i++) {
//            out.append(numbers[i]);
//            if (i < numbers.length - 1) {
//                out.append(", ");
//            }
//        }

        String eventNumbers =
                Arrays.stream(numbers)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(", "));

        System.out.println(eventNumbers);

        String sortedNumbers =
                Arrays.stream(numbers)
                        .sorted()
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(", "));

        System.out.println(sortedNumbers);

//        System.out.println(out);    }
    }
}