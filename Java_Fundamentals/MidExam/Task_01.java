package Java_Fundamentals.MidExam;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 - Колко бисквити произвежда моята фабрика за 30 дни;
        //2 - Колко повече или по-малко бисквити съм произвел (в процженти %) от конкуренцията
        int biscuitsPerWorkerPerDay = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());
        int amountBiscuitsCompetingFactory = Integer.parseInt(scanner.nextLine());

        double totalProduce = 0.0;

        for (int i = 1; i <= 30; i++) {
            //Произведени бисквити за 30 дни
            double dailyProduce = Math.floor(biscuitsPerWorkerPerDay * countWorkers);

            if (i % 3 == 0) {
                dailyProduce = Math.floor(biscuitsPerWorkerPerDay * countWorkers) * 0.75;
            }
            totalProduce += dailyProduce;
        }
        if (totalProduce > amountBiscuitsCompetingFactory) {
            double moreProduced = totalProduce - amountBiscuitsCompetingFactory;
            double percentProduced1 = (moreProduced / amountBiscuitsCompetingFactory) * 100;
            System.out.printf("You have produced %.0f biscuits for the past month." +
                    "%nYou produce %.2f percent more biscuits.", totalProduce, percentProduced1);
        } else {
            double neededProduce = amountBiscuitsCompetingFactory - totalProduce;
            double percentProduced2 = (neededProduce / amountBiscuitsCompetingFactory) * 100;
            System.out.printf("You have produced %.0f biscuits for the past month." +
                    "%nYou produce %.2f percent less biscuits.", totalProduce, percentProduced2);
        }
    }
}
