package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Task_02 {
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
                    int startSort = Integer.parseInt(tokens[2]);
                    int countSort = Integer.parseInt(tokens[4]);
                    if (startSort+countSort > series.size() || countSort > series.size()){
                        break;
                    }
                    for (int i = startSort; i < startSort + countSort; i++) {
                        sortList.add(series.get(i));
                    }
                    Collections.sort(sortList);
                    int count2 = 0;
                    for (int i = startSort; i < startSort + countSort; i++) {
                        series.set(i, sortList.get(count2));
                        count2++;
                    }

                    break;
                case "remove":
                    count = Integer.parseInt(tokens[1]);
                    if (count > series.size()){
                        break;
                    }
                    for (int i = 0; i < count; i++) {
                        series.remove(0);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.print(series.toString().replaceAll("[\\[\\]]", ""));
    }
}
