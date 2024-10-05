package Java_OOP._09_InterfacesAndAbstraction.BorderControl_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Identifiable> entrants = new ArrayList<>();

        String[] input = scanner.nextLine().split("\\s+");

        while (!input[0].equals("End")) {

            if (input.length == 3) {
                String name = input[0];
                int age = Integer.parseInt(input[1]);
                String id = input[2];
                Identifiable citizen = new Citizen(name, age, id);
                entrants.add(citizen);
            } else if (input.length == 2) {
                String model = input[0];
                String id = input[1];
                Identifiable robot = new Robot(id, model);
                entrants.add(robot);
            }

            input = scanner.nextLine().split("\\s+");
        }

        String fakeIdEnding = scanner.nextLine();

        entrants.stream()
                .filter(entrant -> entrant.getId().endsWith(fakeIdEnding))
                .forEach(entrant -> System.out.println(entrant.getId()));

        /*for (Identifiable entrant : entrants) {
           if (entrant.getId().endsWith(fakeIdEnding)) {
               System.out.println(entrant.getId());
           }
        }*/

    }
}
