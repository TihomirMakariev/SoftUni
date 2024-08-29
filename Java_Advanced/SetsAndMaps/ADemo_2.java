package Java_Advanced.SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class ADemo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> vehicles = new HashMap<>();

        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("BMW", 10);

        for (Map.Entry<String, Integer> entry : vehicles.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

    public static int getFirst(LinkedHashSet<Integer> set) {
        return set.stream().findFirst().orElse(0);


//        Iterator<Integer> iterator = set.iterator();
//        Integer next = iterator.next();
//        iterator.remove();
//        return next;

    }

    public static LinkedHashSet<Integer> readDeck(String line) {
        return Arrays.stream(line.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}


