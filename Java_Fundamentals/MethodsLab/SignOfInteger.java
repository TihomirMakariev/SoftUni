package Java_Fundamentals.MethodsLab;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printInWords(number);
    }

    public static void printInWords(int number) {

        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number > 0){
            System.out.printf("The number %d is positive", number);
        }else {
            System.out.printf("The number %d is zero", number);
        }

    }
}
