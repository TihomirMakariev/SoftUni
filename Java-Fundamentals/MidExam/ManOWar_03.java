package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pirateShipInput = scanner.nextLine();
        String[] pirateShipInputSplit = pirateShipInput.split(">");
        List<Integer> pirateShip = new ArrayList<>();
        for (String currentSector : pirateShipInputSplit) {
            pirateShip.add(Integer.parseInt(currentSector));
        }


        String warShipInput = scanner.nextLine();
        String[] warShipInputSplit = warShipInput.split(">");
        List<Integer> warShip = new ArrayList<>();
        for (String currentSector : warShipInputSplit) {
            warShip.add(Integer.parseInt(currentSector));
        }


        int maxHealth = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Retire")) {
            String[] commandArguments = command.split(" ");
            String commandName = commandArguments[0];

            switch (commandName) {
                case "Fire":
                    int fireIndex = Integer.parseInt(commandArguments[1]);
                    int damage = Integer.parseInt(commandArguments[2]);

                    if (fireIndex < 0 || fireIndex >= warShip.size()) {
                        break;
                    }

                    int sectionHealth = warShip.get(fireIndex); // warShip[fireIndex]
                    sectionHealth -= damage;

                    if (sectionHealth <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    } else {
                        warShip.set(fireIndex, sectionHealth); // warShip[fireIndex] = sectionHealth
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandArguments[1]);
                    int endIndex = Integer.parseInt(commandArguments[2]);
                    int damageDealt = Integer.parseInt(commandArguments[3]);

                    if (startIndex < 0 || startIndex >= pirateShip.size()) {
                        break;
                    }
                    if (endIndex < 0 || endIndex >= pirateShip.size()) {
                        break;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        int currentSection = pirateShip.get(i); // pirateShip[i]
                        currentSection -= damageDealt;
                        if (currentSection <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        } else {
                            pirateShip.set(i, currentSection); // pirateShip[i] = currentSection;
                        }
                    }
                    break;
                case "Repair":
                    int repairIndex = Integer.parseInt(commandArguments[1]);
                    int repairHealth = Integer.parseInt(commandArguments[2]);
                    if (repairIndex < 0 || repairIndex >= pirateShip.size()) {
                        break;
                    }
                    int sectionToRepair = pirateShip.get(repairIndex); // pirateShip[repairIndex];
                    sectionToRepair += repairHealth;

                    if (sectionToRepair > maxHealth) {
                        sectionToRepair = maxHealth;
                    }
                    pirateShip.set(repairIndex, sectionToRepair); // pirateShip[sectionToRepair] = sectionToRepair;

                    break;
                case "Status":
                    int count = 0;
                    for (Integer currentSection : pirateShip) {
                        if (currentSection < 0.2 * maxHealth) {
                            count++;
                        }
                    }
                    System.out.println(count + " sections need repair.");
                    break;
            }

            command = scanner.nextLine();
        }

        //Тук
        int pirateShipStatus = 0;
        for (Integer currentStatus : pirateShip) {
            pirateShipStatus += currentStatus;
        }

        int warShipStatus = 0;
        for (Integer currentStatus : warShip) {
            warShipStatus += currentStatus;
        }

        System.out.println("Pirate ship status: " + pirateShipStatus);
        System.out.println("Warship status: " + warShipStatus);



    }
}
