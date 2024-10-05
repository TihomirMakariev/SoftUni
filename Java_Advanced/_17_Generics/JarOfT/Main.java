package Java_Advanced._17_Generics.JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();

        jar.add("13");
        jar.add("42");
        jar.add("69");

        System.out.println(jar.remove());
        System.out.println(jar.remove());
        System.out.println(jar.remove());

    }
}
