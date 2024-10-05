package Java_Advanced._08_SetsAndMapsExercise;

import java.util.*;

public class Demo_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, TreeMap<String, List<Integer>>> dragonsInformation = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            //"Red" "Bazgargal" "100" "2500" "25" или -  Gold Traxx 500 null 0
            //Default values -> damage 45, health 250 and armor 10

            String[] input = scanner.nextLine().split("\\s+");
            String types = input[0];
            String name = input[1];
            int damage;
            int health;
            int armor;

            if (input[2].equals("null")) {
                damage = 45;
            } else {
                damage = Integer.parseInt(input[2]);
            }

            if (input[3].equals("null")) {
                health = 250;
            } else {
                health = Integer.parseInt(input[3]);
            }

            if (input[4].equals("null")) {
                armor = 10;
            } else {
                armor = Integer.parseInt(input[4]);
            }

            dragonsInformation.putIfAbsent(types, new TreeMap<>());
            dragonsInformation.get(types).putIfAbsent(name, new ArrayList<>());
            dragonsInformation.get(types).get(name).add(0, damage);
            dragonsInformation.get(types).get(name).add(1, health);
            dragonsInformation.get(types).get(name).add(2, armor);
        }

        for (Map.Entry<String, TreeMap<String, List<Integer>>> entry : dragonsInformation.entrySet()) {
            int size = entry.getValue().size();
            double avgDamage = 0;
            double avgHealth = 0;
            double avgArmor = 0;

            for (Map.Entry<String, List<Integer>> entryTreeMap : entry.getValue().entrySet()) {
                avgDamage += entryTreeMap.getValue().get(0);
                avgHealth += entryTreeMap.getValue().get(1);
                avgArmor += entryTreeMap.getValue().get(2);
            }
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", entry.getKey(), avgDamage / size, avgHealth / size, avgArmor / size);
            for (Map.Entry<String, List<Integer>> entryTreeMap : entry.getValue().entrySet()) {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                        entryTreeMap.getKey(),
                        entryTreeMap.getValue().get(0),
                        entryTreeMap.getValue().get(1),
                        entryTreeMap.getValue().get(2));
            }
        }
    }
}

