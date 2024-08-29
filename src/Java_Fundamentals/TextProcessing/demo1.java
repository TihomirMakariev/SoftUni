package Java_Fundamentals.TextProcessing;

public class demo1 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        String a = "abcd";

        for (int i = a.length() - 1; i >= 0; i--) {
            char b = a.charAt(i);
            System.out.print(b);
        }
    }
}
