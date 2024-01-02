package AssociativeArraysExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> lettersCount = new LinkedHashMap<>();

        for (int index = 0; index <= text.length() -1; index++) {
            char currentSymbol = text.charAt(index);

            if (currentSymbol == ' '){
                continue;
            }
            if (!lettersCount.containsKey(currentSymbol)){
                //не сме срещали символа
                lettersCount.put(currentSymbol, 1);
            } else{
                //вече сме срещали символа
                lettersCount.put(currentSymbol, lettersCount.get(currentSymbol) +1);
            }
        }
        lettersCount.forEach((k, v ) -> System.out.println(k + " -> " + v));
        /*for (Map.Entry<Character, Integer> entry:lettersCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() );
        }*/
    }
}
