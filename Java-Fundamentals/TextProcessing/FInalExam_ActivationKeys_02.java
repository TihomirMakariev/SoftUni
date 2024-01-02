package TextProcessing;

import java.util.Scanner;

public class FInalExam_ActivationKeys_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder rawActivationKey = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Generate")){
            String[] cmd = input.trim().split(">>>");

            switch (cmd[0]){
                case "Contains":
                    if (rawActivationKey.toString().contains(cmd[1])){
                        System.out.printf("%s contains %s\n", rawActivationKey.toString(), cmd[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    // call flip();

                    String toUpperOrLowerKeys = cmd[1];
                    int startingIndex = Integer.parseInt(cmd[2]);
                    int endingIndex = Integer.parseInt(cmd[3]);
                    flip(rawActivationKey, toUpperOrLowerKeys, startingIndex, endingIndex);
                    System.out.println(rawActivationKey.toString());
                    break;
                case "Slice":
                    rawActivationKey.delete(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
                    System.out.println(rawActivationKey.toString());
            }

            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + rawActivationKey.toString());

    }

    private static void flip(StringBuilder rawActivationKey, String toUpperOrLowerKeys, int startingIndex, int endingIndex) {
        //The end index is exclusive as per rule;
        String extractedSubstring = (rawActivationKey.substring(startingIndex, endingIndex));
        if (toUpperOrLowerKeys.equals("Upper")){
            extractedSubstring = extractedSubstring.toString().toUpperCase();
        } else {
            extractedSubstring = extractedSubstring.toString().toLowerCase();
        }
        rawActivationKey.replace(startingIndex, endingIndex, extractedSubstring);
    }
}