package Java_Fundamentals.MethodsExercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        double factorial1 = calculateFactorial(number1);
        double factorial2 = calculateFactorial(number2);
        double result = factorial1 / factorial2;
        System.out.printf("%.2f", result);

    }

    static double calculateFactorial(int number) {
        double fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
