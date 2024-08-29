package Java_Advanced.StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //N, S, X
        int n = scanner.nextInt(); //колко елемента искам да добавя -> колко пъти ще изпълня push
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        //n на брой пъти добавяме
        for (int count = 1; count <= n; count++) {
            stack.push(scanner.nextInt());
        }

        //s на брой пъти pop
        for (int count = 1; count <= s; count++) {
            stack.pop();
        }

        //x число, за което проверяваме дали е в стека
        if (stack.contains(x)) {
            System.out.println("true");
        } else {
            if (!stack.isEmpty()) {
                System.out.println(Collections.min(stack));
            } else {
                System.out.println(0);
            }
        }
    }
}
