package Java_Fundamentals.MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Четене на числото n от конзолата
        int n = scanner.nextInt();

        // Намиране и отпечатване на всички топ числа в диапазона [1...n]
        for (int i = 1; i <= n; i++) {
            if (isSumOfDigitsDivisibleBy8(i) && hasAtLeastOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    // Метод за проверка дали сумата на цифрите е делима на 8
    public static boolean isSumOfDigitsDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum % 8 == 0;
    }

    // Метод за проверка дали числото съдържа поне една нечетна цифра
    public static boolean hasAtLeastOneOddDigit(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {  // Ако цифрата е нечетна
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
