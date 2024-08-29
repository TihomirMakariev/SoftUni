package Java_Fundamentals.MidExamPopravka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        double budget = Double.parseDouble(scanner.nextLine());

        double maxPrice = 0;
        double profit;
        double newPriceItem;
        double money = 0;

        List<Double> newPrices = new ArrayList<>();


        for (int i = 0; i < items.size(); i++) {
            String[] input = items.get(i).split("->");
            newPriceItem = Double.parseDouble(input[1]);

            if (input[0].equals("Clothes")) {

                maxPrice = 50;
            }
            if (input[0].equals("Shoes")) {
                maxPrice = 35;
            }
            if (input[0].equals("Accessories")) {
                maxPrice = 20.50;
            }
            if (budget >= newPriceItem && newPriceItem <= maxPrice) {
                budget -= newPriceItem;
                newPrices.add(newPriceItem * 1.4);
            }
        }


        for (int i = 0; i < newPrices.size(); i++) {
            budget += newPrices.get(i);
            money += newPrices.get(i);

            System.out.printf("%.2f ", newPrices.get(i));
        }


        System.out.println();


        profit = money - (money / 1.4);
        System.out.printf("Profit: %.2f%n", profit);

        if (budget >= 150) {
            System.out.println("Hello, France!");
        } else {
            System.out.println("Time to go.");
        }
    }
}
