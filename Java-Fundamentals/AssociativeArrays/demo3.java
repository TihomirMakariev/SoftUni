package AssociativeArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> words = new ArrayList<>();
        words.add("cat");
        words.add("dogs");
        words.add("apples");
        words.add("girl");
        words.add("apple");
        words.add("beautiful");

        List<String> filteredList = words.stream()
                .filter(w -> {
                    System.out.println("filter " + w);
                    return  w.length() <= 6;
                })
                .map(w -> w.toUpperCase()) //.map(String::toUpperCase());
                .sorted((a,b) -> a.compareTo(b)) //Integer.compare(a.length(), b.length())
                .limit(1)
                .collect(Collectors.toList());

        //filteredList.toArray(new String[filteredList.size()]);

        System.out.println(String.join(" ", filteredList));

    }
}
