package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"1 2 3 4 5"
        String input = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] splittedInput = input.split(" "); // ["1", "2", "3", "4", "5"]
        for (String element : splittedInput) {
            stack.push(Integer.parseInt(element));
        }

        //stop: stack e empty
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }





    }
}
