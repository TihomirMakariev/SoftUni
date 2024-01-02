package TextProcessing;

import java.util.Scanner;

public class FInalExam_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder key = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Generate")) {
            //Contains>>>{substring}
            String[] commandArray = command.split(">>>");
            String commandName = commandArray[0];
            switch (commandName) {
                case "Contains":
                    String wordToSearchFor = commandArray[1];
                    if (key.indexOf(wordToSearchFor) != -1) {
                        System.out.printf("%s contains %s%n", key, wordToSearchFor);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String flipCase = commandArray[1];
                    int flipBegInIndex = Integer.parseInt(commandArray[2]);
                    int flipEndInIndex = Integer.parseInt(commandArray[3]);
                    for (int i = flipBegInIndex; i < flipEndInIndex; i++) {
                        char currentChar = key.charAt(i);
                        if (flipCase.equals("Lower")){
                            key.setCharAt(i, Character.toLowerCase(currentChar));
                        }else if(flipCase.equals("Upper")) {
                            key.setCharAt(i, Character.toUpperCase(currentChar));
                        }
                    }
                    System.out.println(key);
                    break;

                case "Slice":
                int sliceBeginIndex = Integer.parseInt(commandArray[1]);
                int sliceEndIndex = Integer.parseInt(commandArray[2]);
//                key.replace(sliceBeginIndex, sliceEndIndex, "");
                    key.delete(sliceBeginIndex, sliceEndIndex);
                    System.out.println(key);
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + key);
    }
}