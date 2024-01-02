package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();
        for (int i = 1; i <= countCommands ; i++) {
            String command = scanner.nextLine();
            //"{name} is going!" -> добавяме ако го няма; ако го има -> печатаме ...
            //"{name} is not going!" -> ако го има -> махаме; ако го няма -> печатаме
            String [] tokens = command.split("\\s+");
            //["{name}, "is", "going!"]
            //["{name}, "is", "not", "going!"]
            String name = tokens[0];
            if(tokens[2].equals("going!")) { //Going :)
                if(names.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    names.add(name);
                }
            } else if (tokens[2].equals("not")) { //Not Going :(
                if(names.contains(name)) {
                    names.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }

        }
        printList(names);

    }

    private static void printList(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
