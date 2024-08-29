package Java_Fundamentals.MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Изчисляване на резултата
        int result = multiplySumsOfEvenAndOddDigits(Math.abs(number));

        // Отпечатване на резултата
        System.out.println(result);
    }

    public static int multiplySumsOfEvenAndOddDigits(int number) {
        int sumEven = 0;
        int sumOdd = 0;

        // Обхождане на всички цифри в числото
        while (number > 0) {
            int digit = number % 10;  // Извличане на последната цифра
            if (digit % 2 == 0) {
                sumEven += digit;  // Ако цифрата е четна, добавяме я към сумата на четните цифри
            } else {
                sumOdd += digit;   // Ако цифрата е нечетна, добавяме я към сумата на нечетните цифри
            }
            number /= 10;  // Премахване на последната цифра
        }

        // Връщане на произведението на двете суми
        return sumEven * sumOdd;
    }

}
