package Java_Advanced._08_SetsAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine(); //ресурс или stop
        //ресурс -> количество
        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();
        while(!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            //да нямам такъв ресурс
            if(!resourcesQuantity.containsKey(resource)) {
                resourcesQuantity.put(resource, quantity);
            } else {
                resourcesQuantity.put(resource, resourcesQuantity.get(resource) + quantity);
            }

            resource = scanner.nextLine();
        }

        resourcesQuantity.forEach((k, v) -> System.out.println(k + " -> " + v));

        //различни подходи на forEach
//        minerTask.entrySet().stream()
//                .forEach(entry ->{
//                    System.out.println(entry.getKey() + " -> " + entry.getValue());
//                });
            //различни подходи на forEach
//        for (Map.Entry<String, Integer> entry : minerTask.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }

    }
}
