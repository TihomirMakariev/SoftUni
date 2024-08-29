package Java_Advanced.SetsAndMapsExercise;

import java.util.TreeMap;

public class Demo_2 {
    public static void main(String[] args) {

        TreeMap<Integer, String> hash_map = new TreeMap<>();

        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(30, "Geeks");
        hash_map.put(25, "Welcome");
        hash_map.put(20, "You");

//        //Displaying the HashMap
//        System.out.println("Initial Mapping are: " + hash_map);
//
//        //Using the entrySet() to get the set view
//        System.out.println("The set is: " + hash_map.entrySet());
//
//        hash_map.forEach((key, value) -> System.out.print(key + ":"));

//        hash_map.forEach((key, value) -> System.out.println(key + " : " + value));
//
//        hash_map.forEach((key, value) -> System.out.println(key + " - " + value));
//
//        hash_map.forEach((key, value) -> System.out.println(key + ":" + value));

//        for (Map.Entry<Integer, String> entry : hash_map.entrySet()) {
//            System.out.println(entry.getKey() + "/" + entry.getValue());
//        }
//
//        for (var entry : hash_map.entrySet()) {
//            System.out.println(entry.getKey() + "::" + entry.getValue());
//        }

        hash_map.forEach((k, v) -> System.out.println("Key: " + k + " -- " + "Value: " + v));

        hash_map.forEach((k,v) -> System.out.println(k + v));

    }

}
