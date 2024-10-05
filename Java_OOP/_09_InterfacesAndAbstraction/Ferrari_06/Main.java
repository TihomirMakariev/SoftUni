package Java_OOP._09_InterfacesAndAbstraction.Ferrari_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String driverName = scanner.nextLine();

        Car ferrari = new Ferrari(driverName);

        print(ferrari);


    }

    private static void print(Car ferrari) {
        System.out.println(ferrari);
    }
}
