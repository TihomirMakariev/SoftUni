package Java_Fundamentals.AssociativeArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        numbers = removeNegativeNumber(numbers);
        Collections.reverse(numbers);
        if (numbers.isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", " "));
        }
    }

    private static List<Integer> removeNegativeNumber(List<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number < 0) {
                numbers.remove(i);
                i--;
            }
        }

        return numbers;
    }
}
