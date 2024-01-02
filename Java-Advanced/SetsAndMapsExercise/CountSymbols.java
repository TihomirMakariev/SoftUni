package SetsAndMapsExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol = text.charAt(index);

            if (!map.containsKey(currentSymbol)){
                map.put(currentSymbol, 1);
            } else {
                int currentCount = map.get(currentSymbol);
                map.put(currentSymbol, currentCount + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }
    }
}
