package Methods;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = readFullName(scanner);
        System.out.println(fullName);
    }

    private static String readFullName(Scanner scanner) {
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        return firstName + " " + lastName;
    }
}
