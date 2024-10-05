package Java_Advanced._08_SetsAndMapsExercise;

import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, List<Integer>>> types = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String type = input[0];
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
            if (input[4].equals("null")){
                armor = 10;
            } else {
                armor = Integer.parseInt(input[4]);
            }

            types.putIfAbsent(type, new TreeMap<>());
            types.get(type).putIfAbsent(name, new ArrayList<>());
            types.get(type).get(name).add(0, damage);
            types.get(type).get(name).add(1, health);
            types.get(type).get(name).add(2, armor);
        }

        for (Map.Entry<String, TreeMap<String, List<Integer>>> entry : types.entrySet()) {
            int size = entry.getValue().size();
            double avgDmg = 0;
            double avgHp = 0;
            double avgArmor = 0;

            for (Map.Entry<String, List<Integer>> s : entry.getValue().entrySet()) {
                avgDmg += s.getValue().get(0);
                avgHp += s.getValue().get(1);
                avgArmor += s.getValue().get(2);
            }
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", entry.getKey(), avgDmg / size, avgHp / size, avgArmor / size);
            for (Map.Entry<String, List<Integer>> s : entry.getValue().entrySet()) {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", s.getKey(), s.getValue().get(0), s.getValue().get(1), s.getValue().get(2));
            }
        }
    }
}
