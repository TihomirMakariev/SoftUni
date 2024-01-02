package SetsAndMapsExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFirstSet = scanner.nextInt();
        int countSecondSet = scanner.nextInt();

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 1; i <=countFirstSet ; i++) {
            int currentNumber = scanner.nextInt();
            firstSet.add(currentNumber);
        }

        for (int i = 1; i <=countSecondSet ; i++) {
            int currentNumber = scanner.nextInt();
            secondSet.add(currentNumber);
        }

        firstSet.retainAll(secondSet);

//        for (Integer element : firstSet) {
//            System.out.print(element + " ");
//        }

        firstSet.forEach(e-> System.out.print(e + " "));

    }

}
