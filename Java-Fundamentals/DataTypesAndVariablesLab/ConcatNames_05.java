package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String symbol = scanner.nextLine();

        //System.out.println(firstName + symbol + secondName);
        System.out.printf("%s%s%s", firstName, symbol, secondName);

    }
}
