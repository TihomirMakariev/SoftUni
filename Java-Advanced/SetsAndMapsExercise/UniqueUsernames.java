package SetsAndMapsExercise;

import java.util.*;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> set = new LinkedHashSet<>();

        while (n-- > 0) {
            String currentWord = scanner.nextLine();
            set.add(currentWord);
        }

//        for (int i = 1; i <= n; i++){
//            String currentWord = scanner.nextLine();
//            set.add(currentWord);
//        }

        for (String element : set) {
            System.out.println(element);
        }
    }

}
