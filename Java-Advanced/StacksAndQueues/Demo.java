package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(13);
        stack.push(42);
        stack.push(69);
        stack.push(73);

        System.out.println("Stack: ");
        for (Integer integer : stack) {
            System.out.println(integer);

        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(13);
        queue.offer(42);
        queue.offer(69);
        queue.offer(73);

        System.out.println("Queue: ");

        for (Integer integer : queue) {
            System.out.println(integer);
        }
        System.out.println();
    }
}
