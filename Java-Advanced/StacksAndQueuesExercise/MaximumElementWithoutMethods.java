package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElementWithoutMethods {
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

        while (!stack.isEmpty()){
            int currentElement = stack.pop();

            if (currentElement > max){
                max = currentElement;
            }
        }
        return max;
    }
}
