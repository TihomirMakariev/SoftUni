package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int pourLiters = Integer.parseInt(scanner.nextLine());
            capacity -= pourLiters;
            if (capacity < 0) {
                System.out.println("Insufficient capacity!");
                capacity += pourLiters;
            }
        }
        System.out.println(255 - capacity);
    }
}
