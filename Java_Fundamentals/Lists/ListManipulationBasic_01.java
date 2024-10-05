package Java_Fundamentals.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ListManipulationBasic_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(
                Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList());  // Връща неизменяем списък

        String commands = scanner.nextLine();

        while (!commands.equals("end")) {
            String[] commandParts = commands.split(" ");
            String action = commandParts[0];

            switch (action) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                        int numberToRemove = Integer.parseInt(commandParts[1]);
                        numbers.remove(Integer.valueOf(numberToRemove));
                        break;

                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandParts[1]);
                    int indexToInsert = Integer.parseInt(commandParts[2]);
                    numbers.add(indexToInsert, numberToInsert);
                    break;
            }

            commands = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }


    }
}
