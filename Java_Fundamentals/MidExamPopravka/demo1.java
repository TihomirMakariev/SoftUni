package Java_Fundamentals.MidExamPopravka;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double fuelPerKM = Double.parseDouble(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double room = Double.parseDouble(scanner.nextLine());

        if (people > 10) {
            room *= 0.75;
        }
        double expenses = days * people * (food + room);
        for (int i = 1; i <= days; i++) {
            double travelledDistance = Double.parseDouble(scanner.nextLine());
            expenses += travelledDistance * fuelPerKM;

            if (i % 3 == 0 || i % 5 == 0) {
                expenses *= 1.4;
            }
            if (i % 7 == 0) {
                expenses -= expenses / people;
            }

            if (expenses > budget) {
                double needMoney = expenses - budget;
                System.out.printf("Not enough money to continue the trip. " +
                        "You need %.2f$ more.", needMoney);
                return;
            }

        }
        double reachedMoney = budget - expenses;
        System.out.printf("You have reached the destination. You have %.2f$ budget left.", reachedMoney);
    }
}
