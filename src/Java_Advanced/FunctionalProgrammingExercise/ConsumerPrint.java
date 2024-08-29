package Java_Advanced.FunctionalProgrammingExercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща>
        //Consumer <приема> -> void
        //Supplier <връща>
        //Predicate<приема> -> връща true/false
        //BiFunction<приема1, приема2, връща>

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

        Consumer<String[]> printString = array -> {
            for (int index = 0; index < array.length ; index++) {
                System.out.println(array[index]);
            }
        };

        printString.accept(names);

    }
}
