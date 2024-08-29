package Java_Fundamentals.DataTypesAndVariablesLab;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(sum + " -> True");
            } else {
                System.out.println(sum + " -> False");
            }
        }
    }
}
