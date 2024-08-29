package Java_Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            //•	Delete {element} ->["Delete", "5"]
            //•	Insert {element} {position} ->["Insert", "5", "2"]

            String command = input.split("\\s+")[0];
            int element = Integer.parseInt(input.split("\\s+")[1]);

            if (command.equals("Delete")) {
                numbers.removeAll(Arrays.asList(element));
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(input.split("\\s+")[2]);
                numbers.add(index, element);
            }

            input = scanner.nextLine();
        }
        printList(numbers);
    }

    private static void printList(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
