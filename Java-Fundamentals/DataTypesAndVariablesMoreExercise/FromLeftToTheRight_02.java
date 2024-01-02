package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <=input ; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());



            System.out.println(number1);
            System.out.println(number2);

        }
    }
}
