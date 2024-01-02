package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    //•	Add {number} - add number at the end
                    int addNumber = Integer.parseInt(tokens[1]);
                    numbers.add(addNumber);
                    break;

                case "Insert":
                    //•	Insert {number} {index} - insert number at given index
                    int insertNumber = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    //•	Validate index
                    if (isValidIndex(index, numbers.size())) {
                        numbers.add(index, insertNumber);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Remove":
                    //•	Remove {index} - remove that index
                    int indexRemove = Integer.parseInt(tokens[1]);
                    //•	Validate index
                    if (isValidIndex(indexRemove, numbers.size())) {
                        numbers.remove(indexRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":
                    //•	Shift left {count} - first number becomes last 'count' times
                    //•	Shift right {count} - last number becomes first 'count' times
                    String direction = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if (direction.equals("right")) {
                        for (int i = 1; i <= count; i++) {
                            //последния става първи
                            //1. последния
                            int lastNumber = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastNumber);
                        }

                    } else if (direction.equals("left")) {
                        for (int i = 1; i <= count; i++) {
                            int firstNumber = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstNumber);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        printList(numbers);
    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index <= length - 1;
    }

    private static void printList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
