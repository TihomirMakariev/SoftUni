package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String currentProduct = input.split(" ")[0];
            double currentPrice = Double.parseDouble(input.split(" ")[1]);
            int currentQuantity = Integer.parseInt(input.split(" ")[2]);

            productsPrice.put(currentProduct, currentPrice);

            if (!productsQuantity.containsKey(currentProduct)) {
                productsQuantity.put(currentProduct, currentQuantity);
            } else {
                productsQuantity.put(currentProduct, productsQuantity.get(currentProduct) + currentQuantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            //key (име на продукта) -> value (цена)
            //цена * количество
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productsQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
