package Java_OOP._10_InterfacesAndAbstraction_Exercise.FoodShortage_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Buyer> buyers = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] token = scanner.nextLine().split("\\s+");
            String name = token[0];
            int age = Integer.parseInt(token[1]);

            if (token.length == 4) {
                String id = token[2];
                String birthDate = token[3];
                buyers.put(name, new Citizen(name, age, id, birthDate));
            } else if (token.length == 3) {
                String group = token[2];
                buyers.put(name, new Rebel(name, age, group));
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            if (buyers.containsKey(input)) {
                buyers.get(input).buyFood();
            }
            input = scanner.nextLine();

        }

        /*
        // Calculating total food purchased
        int totalFood = buyers.values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum();*/


        int totalFood = 0;
        for (Buyer buyer : buyers.values())
            totalFood += buyer.getFood();

        System.out.println(totalFood);
    }
}
