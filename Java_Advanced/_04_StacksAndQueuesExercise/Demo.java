package Java_Advanced._04_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //броят на командите
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();

            if (command.equals("2")) {
                stack.pop();
            } else if (command.equals("3")) {
                if (!stack.isEmpty()) {
                    System.out.println(getMaxElement(stack));
                }
            } else if (command.split(" ")[0].equals("1")) {
                int pushElement = Integer.parseInt(command.split(" ")[1]);
                stack.push(pushElement);
            }

        }
    }

    private static int getMaxElement(ArrayDeque<Integer> stack) {
        int max = Integer.MIN_VALUE;

        while (!stack.isEmpty()) {
            int currentElement = stack.pop();
            if (currentElement > max){
                max = currentElement;
            }
        }
        return max;
    }
}
