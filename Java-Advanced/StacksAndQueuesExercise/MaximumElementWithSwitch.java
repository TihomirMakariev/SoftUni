package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElementWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //броят на командите
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int count = 1; count <= n ; count++) {
            String command = scanner.nextLine();
            //"1 98" -> split(" ") -> ["1", "98"]
            //"2"
            //"3"
            switch (command) {
                case "2":
                    stack.pop();
                    break;
                case "3":
                    if (!stack.isEmpty()) {
                        System.out.println(Collections.max(stack));
                    }
                    break;
                default:
                    int pushElement = Integer.parseInt(command.split(" ")[1]);
                    stack.push(pushElement);
                    break;
            }
        }
    }
}
