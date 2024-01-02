package DefiningClassesExercise.SpeedRacing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> cars = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-->0){
            String [] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int fuelAmount = Integer.parseInt(input[1]);
            double fuelCostForOneKm = Double.parseDouble(input[2]);

            Car car = new Car(model, fuelAmount, fuelCostForOneKm, 0);
            cars.put(model, car);
        }
        String [] input = scanner.nextLine().split("\\s+");

        while (!input[0].equals("End")){
            double kmToDrive= Double.parseDouble(input[2]);
            String carModelToDrive = input[1];
            cars.get(carModelToDrive).driveCar(kmToDrive);

            /* double kmToDrive = Double.parseDouble(input[2]);


            double currentFuel = cars.get(carModelToDrive).getFuelAmount();
            double fuelToBeSpent = cars.get(carModelToDrive).getFuelCost()* kmToDrive;

            if (currentFuel>= fuelToBeSpent){
                double afterDriveFuel = cars.get(carModelToDrive).getFuelAmount()- cars.get(carModelToDrive).getFuelCost()*kmToDrive;

                cars.get(carModelToDrive).setFuelAmount(afterDriveFuel); //set fuel

                cars.get(carModelToDrive).setDistanceTravelled(cars.get(carModelToDrive).getDistanceTravelled()+kmToDrive);

            }else {
                System.out.println("Insufficient fuel for the drive");


            }
            */

            input= scanner.nextLine().split("\\s+");
        }

        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
}
