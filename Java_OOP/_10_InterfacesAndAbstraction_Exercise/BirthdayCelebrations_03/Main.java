package Java_OOP._10_InterfacesAndAbstraction_Exercise.BirthdayCelebrations_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Birthable> birthablesEntities = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] token = input.split("\\s+");

            if (token[0].equals("Citizen")) {
                String name = token[1];
                int age = Integer.parseInt(token[2]);
                String id = token[3];
                String birthDate = token[4];
                Birthable birthable = new Citizen(name, age, id, birthDate);
                birthablesEntities.add(birthable);

            } else if (token[0].equals("Pet")) {
                String name = token[1];
                String birthDate = token[2];
                Birthable birthable = new Pet(name, birthDate);
                birthablesEntities.add(birthable);
            }

            input = scanner.nextLine();
        }

        String specificYear = scanner.next();

        for (Birthable birthable : birthablesEntities) {
            if (birthable.getBirthDate().endsWith(specificYear)) {
                System.out.println(birthable.getBirthDate());
            }
        }

    }
}
