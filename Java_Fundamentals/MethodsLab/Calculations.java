package Java_Fundamentals.MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                getAddNumbers(firstNumber, secondNumber);
                break;
            case "multiply":
                getMultiplyNumbers(firstNumber, secondNumber);
                break;
            case "subtract":
                getSubtractNumbers(firstNumber, secondNumber);
                break;
            case "divide":
                getDivideNumbers(firstNumber, secondNumber);
                break;
        }

    }

    private static void getAddNumbers(int firstNumber, int secondNumber) {
        int addNumbers = firstNumber + secondNumber;
        System.out.println(addNumbers);
    }

    private static void getSubtractNumbers(int firstNumber, int secondNumber) {
        int subtractNumbers = firstNumber - secondNumber;
        System.out.println(subtractNumbers);
    }

    private static void getMultiplyNumbers(int firstNumber, int secondNumber) {
        int multiplyNumbers = firstNumber * secondNumber;
        System.out.println(multiplyNumbers);
    }

    private static void getDivideNumbers(int firstNumber, int secondNumber) {
        int divideNumbers = firstNumber / secondNumber;
        System.out.println(divideNumbers);
    }

}
