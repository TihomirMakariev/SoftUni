package SetsAndMapsExercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new HashSet<>();

        set.add("Tihi");
        set.add("Tihi");
        set.remove("Tihi");
        System.out.println(set.size());
        set.clear();





    }
}
