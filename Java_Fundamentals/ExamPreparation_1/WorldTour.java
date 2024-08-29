package Java_Fundamentals.ExamPreparation_1;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Hawai::Cyprys-Greece

        StringBuilder initialDestination = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] commandParts = input.split(":");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Add Stop":
                    //Add Stop:7:Rome
                    int addStopIndex = Integer.parseInt(commandParts[1]);
                    String stopToInsert = commandParts[2];
                    if (addStopIndex >= 0 && addStopIndex < initialDestination.length()){
                        initialDestination.insert(addStopIndex, stopToInsert);
                    }
                    System.out.println(initialDestination);
                    break;

                case "Remove Stop":
                    int removeBeginIndex = Integer.parseInt(commandParts[1]);
                    int removeEndIndex = Integer.parseInt(commandParts[2]);

                    if (removeBeginIndex >= 0 && removeEndIndex< initialDestination.length() &&
                            removeEndIndex>=0 && removeEndIndex< initialDestination.length()){
                        initialDestination.delete(removeBeginIndex, removeEndIndex+1);
                }
                System.out.println(initialDestination);
                    break;

                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];
                    String destinationAsString = initialDestination.toString();
                    destinationAsString = destinationAsString.replace(oldString, newString);
                    initialDestination = new StringBuilder(destinationAsString);
                    System.out.println(initialDestination);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", initialDestination);
    }
}