package Java_Advanced._04_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //броят на командите
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int count = 1; count <= n ; count++) {
            String command = scanner.nextLine();
            //"1 98" -> split(" ") -> ["1", "98"]
            //"2"
            //"3"
            if(command.equals("2")){
                stack.pop();
            } else if (command.equals("3")) {
                if(!stack.isEmpty()) {
                    System.out.println(Collections.max(stack));
                }
            } else if (command.split(" ")[0].equals("1")) {
                int pushElement = Integer.parseInt(command.split(" ")[1]);
                stack.push(pushElement);
            }
        }
    }
}
