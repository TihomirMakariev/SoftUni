package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Взимаме последната цифра
        //Сумираме
        //Премахваме последната цифра

        int number = Integer.parseInt(scanner.nextLine());
        //stop -> num ==0
        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            //sum +=lastDigit;
            number = number / 10;
            //number /=10;

        }
        System.out.println(sum);

    }
}
