package Java_Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        String fileName = scanner.nextLine();

        while (!fileName.equals("print")) {

            if (fileName.equals("cancel")) {
                String canceledFile = printerQueue.poll();
                if (canceledFile == null) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + canceledFile);
                }

            } else {
                printerQueue.offer(fileName);
            }

            fileName = scanner.nextLine();
        }

        while (!printerQueue.isEmpty()){
            System.out.println(printerQueue.poll());
        }
    }
}
