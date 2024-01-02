package AssociativeArraysExercise;

import java.util.*;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> users = new LinkedHashMap<>();


        for (int i = 1; i <= n ; i++) {
            //register John CS1234JS
            //unregister Andy
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String userName = tokens[1];

            switch (command){
                case "register":
                String plateNumber = tokens[2];

                if (users.containsKey(userName)){
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }else {
                users.put(userName, plateNumber);
                    System.out.printf("%s registered %s successfully%n", userName, plateNumber);
                }
                    break;

                case "unregister":
                if (users.containsKey(userName)){
                    users.remove(userName);
                    System.out.printf("%s unregistered successfully%n", userName);

                }else {
                    System.out.printf("ERROR: user %s not found%n", userName);
                }
                    break;
            }
        }
        users.forEach((k,v) -> System.out.println(k + " => " + v));
    }
}
