package Java_Fundamentals.ObjectsAndClasses.Songs_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Списък за съхранение на песните
        List<Song> songs = new ArrayList<>();

        //Четене на броят на песните
        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        //Четене на всяка песен
        for (int i = 0; i < numberOfSongs; i++) {
            String[] songData = scanner.nextLine().split("_");
            String type = songData[0];
            String name = songData[1];
            String time = songData[2];

            // Добавяне на песента в списъка
            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        //Четене на последната команда
        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        }else {
            /*
            // Отпечатваме само песните от даден тип
            for (Song song : songs) {
                if (song.getTypeList().equals(command)) {
                    System.out.println(song.getName());
                }
            } */

            List<Song> filteredSongs = songs.stream().filter(s -> s.getTypeList().equals(command)).toList();

            for (Song song : filteredSongs) {
                System.out.println(song.getName());
            }
        }




    }
}
