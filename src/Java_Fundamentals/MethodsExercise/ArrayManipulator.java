package Java_Fundamentals.MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на началния масив от конзолата
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // Четене на команди докато не се получи "end"
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {
                case "exchange":
                    int index = Integer.parseInt(commandParts[1]);
                    if (index >= 0 && index < array.length) {
                        array = exchange(array, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "max":
                    String typeMax = commandParts[1];
                    int maxIndex = findMax(array, typeMax);
                    if (maxIndex != -1) {
                        System.out.println(maxIndex);
                    } else {
                        System.out.println("No matches");
                    }
                    break;

                case "min":
                    String typeMin = commandParts[1];
                    int minIndex = findMin(array, typeMin);
                    if (minIndex != -1) {
                        System.out.println(minIndex);
                    } else {
                        System.out.println("No matches");
                    }
                    break;

                case "first":
                    int countFirst = Integer.parseInt(commandParts[1]);
                    String typeFirst = commandParts[2];
                    if (countFirst > array.length) {
                        System.out.println("Invalid count");
                    } else {
                        int[] firstElements = findFirst(array, countFirst, typeFirst);
                        printArray(firstElements);
                    }
                    break;

                case "last":
                    int countLast = Integer.parseInt(commandParts[1]);
                    String typeLast = commandParts[2];
                    if (countLast > array.length) {
                        System.out.println("Invalid count");
                    } else {
                        int[] lastElements = findLast(array, countLast, typeLast);
                        printArray(lastElements);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        // Принтиране на финалното състояние на масива
        printArray(array);
    }

    // Метод за разменяне на две части от масива след даден индекс
    public static int[] exchange(int[] array, int index) {
        int[] leftPart = Arrays.copyOfRange(array, 0, index + 1);
        int[] rightPart = Arrays.copyOfRange(array, index + 1, array.length);

        int[] newArray = new int[array.length];
        System.arraycopy(rightPart, 0, newArray, 0, rightPart.length);
        System.arraycopy(leftPart, 0, newArray, rightPart.length, leftPart.length);

        return newArray;
    }

    // Метод за намиране на максималния индекс на четно или нечетно число
    public static int findMax(int[] array, String type) {
        int maxIndex = -1;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (type.equals("even") && array[i] % 2 == 0 || type.equals("odd") && array[i] % 2 != 0) {
                if (array[i] >= maxValue) {
                    maxValue = array[i];
                    maxIndex = i;
                }
            }
        }
        return maxIndex;
    }

    // Метод за намиране на минималния индекс на четно или нечетно число
    public static int findMin(int[] array, String type) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (type.equals("even") && array[i] % 2 == 0 || type.equals("odd") && array[i] % 2 != 0) {
                if (array[i] <= minValue) {
                    minValue = array[i];
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }

    // Метод за намиране на първите {count} четни или нечетни числа
    public static int[] findFirst(int[] array, int count, String type) {
        int[] result = new int[count];
        int foundCount = 0;
        for (int i = 0; i < array.length && foundCount < count; i++) {
            if (type.equals("even") && array[i] % 2 == 0 || type.equals("odd") && array[i] % 2 != 0) {
                result[foundCount++] = array[i];
            }
        }
        return Arrays.copyOf(result, foundCount);
    }

    // Метод за намиране на последните {count} четни или нечетни числа
    public static int[] findLast(int[] array, int count, String type) {
        int[] result = new int[count];
        int foundCount = 0;
        for (int i = array.length - 1; i >= 0 && foundCount < count; i--) {
            if (type.equals("even") && array[i] % 2 == 0 || type.equals("odd") && array[i] % 2 != 0) {
                result[foundCount++] = array[i];
            }
        }
        return Arrays.copyOf(result, foundCount);
    }

    // Метод за принтиране на масив във формат "[a, b, c]"
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
