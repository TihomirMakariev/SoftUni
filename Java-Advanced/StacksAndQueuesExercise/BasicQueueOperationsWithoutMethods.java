package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperationsWithoutMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //N, S, X
        int n = scanner.nextInt(); //колко елемента искам да добавя -> колко пъти ще изпълня push
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        //n на брой пъти добавяме
        for (int count = 1; count <= n; count++) {
            queue.offer(scanner.nextInt());
        }

        //s на брой пъти poll
        for (int count = 1; count <= s; count++) {
            queue.poll();
        }

        //x число, за което проверяваме дали е в стека
        if (queue.contains(x)) {
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                System.out.println(getMinElementFromQueue(queue));
            } else {
                System.out.println(0);
            }
        }
    }

    private static int getMinElementFromQueue(ArrayDeque<Integer> queue) {
        int min = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            int currentElement = queue.poll();

            if (currentElement < min) {
                min = currentElement;
            }
        }
        return min;
    }
}
