package Java_OOP._10_InterfacesAndAbstraction_Exercise.Telephony_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входните данни
        List<String> phoneNumbers = Arrays.asList(scanner.nextLine().split("\\s+"));
        List<String> urls = Arrays.asList(scanner.nextLine().split("\\s+"));

        // Създаваме нов обект Smartphone
        Smartphone smartphone = new Smartphone(phoneNumbers, urls);

        // Извикваме всички номера и сърфираме всички URL адреси
        smartphone.callAll();
        smartphone.browseAll();
    }
}