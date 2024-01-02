package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while(!input.equals("end")) {
            //"Add 10" -> split -> ["Add", "10"]
            //"30" -> split -> ["30"]
            String [] tokens = input.split("\\s+");
            if(tokens.length == 2) {
                int newWagon = Integer.parseInt(tokens[1]);
                wagons.add(newWagon);
            } else {
                int passengersToAdd = Integer.parseInt(tokens[0]);
                for (int index = 0; index <= wagons.size() - 1; index++) {
                    int passengersInWagon = wagons.get(index);
                    //мога да добавя ако не стигам макс. капацитет
                    if (passengersInWagon + passengersToAdd <= maxCapacity) {
                        wagons.set(index, passengersInWagon + passengersToAdd);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }

        printList(wagons);

    }

    private static void printList(List<Integer> wagons) {
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
