package ListsExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(6);
        numbers.add(13);
        Collections.sort(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
