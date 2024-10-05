package Java_Advanced._08_SetsAndMapsExercise;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split("\\s+");

            //първи начин
//            set.addAll(Arrays.asList(elements));

            //втори начин
            Collections.addAll(set, elements);

        }

        //Първи начин
//        for (String element : set) {
//            System.out.print(element + " ");
//        }

        //Втори начин
        set.forEach(e-> System.out.print(e + " "));
    }
}
