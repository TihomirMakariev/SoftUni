package Java_Advanced._07_SetsAndMaps;

import java.util.HashSet;
import java.util.TreeSet;

public class ADemo {
    public static void main(String[] args) {

        TreeSet<Integer> numbersInTreeSet = new TreeSet<>();
        HashSet<Integer> numbersInHashSet = new HashSet<>();

        numbersInTreeSet.add(42);
        numbersInTreeSet.add(13);
        numbersInTreeSet.add(73);
        numbersInTreeSet.add(69);

        numbersInHashSet.add(42);
        numbersInHashSet.add(13);
        numbersInHashSet.add(73);
        numbersInHashSet.add(69);


        for (Integer number : numbersInTreeSet) {
            System.out.println(number);
        }

        for (Integer number : numbersInHashSet) {
            System.out.println(number);
        }

    }
}
