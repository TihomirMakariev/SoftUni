package Java_Fundamentals.MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String treasureChestContent = scanner.nextLine();
        String[] splitChest = treasureChestContent.split("\\|");
        List<String> chestContent = Arrays.stream(splitChest).collect(Collectors.toList());

        String command = scanner.nextLine();

        // четем команди докато не стигнем Yohoho
        while (!command.equals("Yohoho!")) {
            String[] commandArray = command.split(" ");
            String currentCommandName = commandArray[0];

            switch (currentCommandName) {
                case "Loot":
                    for (int i = 1; i < commandArray.length; i++) {
                        if (!chestContent.contains(commandArray[i])) {
                            chestContent.add(0, commandArray[i]);
                        }
                    }
                    break;

                case "Drop":
                    int dropIndex = Integer.parseInt(commandArray[1]);
                    if (dropIndex < 0 || dropIndex >= chestContent.size()) {
                        break;
                    }

                    String itemToDrop = chestContent.remove(dropIndex);
                    chestContent.add(itemToDrop);
                    break;

                case "Steal":
                    int stealAmount = Integer.parseInt(commandArray[1]);

                    List<String> stolenItems = new ArrayList<>();
                    String output = "";
                    if (stealAmount>=chestContent.size()){
                        output = String .join(", ", chestContent);
                        System.out.println(output);
                        chestContent.clear();
                    }

                    for (int i = 0; i < stealAmount; i++) {
                        int lastIndex = chestContent.size()-1;
                        stolenItems.add(0, chestContent.remove(lastIndex));
                    }
                    output = String.join(", ", stolenItems);
                    System.out.println(stolenItems);
                    break;


            }


            command = scanner.nextLine();
        }

        System.out.println();
    }
}
