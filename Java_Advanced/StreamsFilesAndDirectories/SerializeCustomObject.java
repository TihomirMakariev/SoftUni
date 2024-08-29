package Java_Advanced.StreamsFilesAndDirectories;

import java.io.*;

public class SerializeCustomObject {
    public static class Cube implements Serializable {
        private String name;
        private int width;
        private int length;
        private int height;

        public Cube(String name, int width, int length, int height) {
            this.name = name;
            this.width = width;
            this.length = length;
            this.height = height;
        }
    }
    public static  void main(String[] args) throws IOException, ClassNotFoundException {
        Cube cube = new Cube("Ice Cube", 13, 42, 69);

         ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("obj.txt")
        );

        outputStream.writeObject(cube);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("obj.txt")
        );

        Cube savedCube = (Cube)inputStream.readObject();

    }
}
