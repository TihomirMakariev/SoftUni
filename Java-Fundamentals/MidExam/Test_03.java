package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> chat = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Chat":
                    chat.add(command[1]);
                    break;
                case "Delete":
                    chat.remove(command[1]);
                    break;
                case "Edit":
                    if (chat.contains(command[1])) {
                        chat.set(chat.indexOf(command[1]), command[2]);
                    }
                    break;
                case "Pin":
                    if (chat.contains(command[1])) {
                        chat.remove(command[1]);
                        chat.add(command[1]);
                    }
                    break;
                case "Spam":
                    for (int i = 1; i < command.length; i++) {
                        chat.add(command[i]);
                    }
            }
            input = scanner.nextLine();
        }
        for (String message : chat) {
            System.out.println(message);
        }
    }
}
