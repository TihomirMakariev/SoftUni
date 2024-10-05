package Java_Fundamentals.MethodsExercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        smallestNumber(first, second, third);

    }

    public static void smallestNumber(int first, int second, int third) {
        int smallestNum = 0;

        if (first < second && first < third) {
            System.out.println(first);
        }else if (second < first && second < third) {
            System.out.println(second);
        }else if (third < second && third < first) {
            System.out.println(third);
        }

    }
}
