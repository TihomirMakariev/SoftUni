package DefiningClassesExercise.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private double distanceTravelled;


    public Car(String model, double fuelAmount, double fuelCost, double distanceTravelled) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distanceTravelled = distanceTravelled;
    }

    public Car(String model, double distanceTravelled) {
        this.model = model;
        this.distanceTravelled =distanceTravelled;

    }

    public String getModel() {
        return model;
    }


    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public Car setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
        return null;
    }

    public void driveCar(double amountOfKm){
        double consumption = amountOfKm * this.fuelCost;
        if (this.fuelAmount - consumption < 0)
        {
            System.out.println("Insufficient fuel for the drive");
        }
        else
        {
            this.fuelAmount -= consumption ;
            this.distanceTravelled += amountOfKm;
        }

    }

    @Override
    public String toString(){
        return String.format("%s %.2f %.0f",model, fuelAmount, distanceTravelled);
    }


}
