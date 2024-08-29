package Java_Fundamentals.MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Demo_02_Copy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> series = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> reversed = new ArrayList<>();
        List<Integer> sortList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] tokens = input.split("\\s+");

            String command = tokens[0];

            switch (command) {
                case "reverse":
                    int start = Integer.parseInt(tokens[2]);
                    int count = Integer.parseInt(tokens[4]);
                    if (start+count > series.size() || start > series.size()){
                        break;
                    }
                    for (int i = start; i < start + count; i++) {
                        reversed.add(series.get(i));
                    }
                    Collections.reverse(reversed);
                    int count1 = 0;
                    for (int i = start; i < start + count; i++) {

                        series.set(i, reversed.get(count1));
                        count1++;
                    }
                    break;

                case "sort":
                    break;

                case "remove":
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.print(series.toString().replaceAll("[\\[\\]]", ""));

    }
}
