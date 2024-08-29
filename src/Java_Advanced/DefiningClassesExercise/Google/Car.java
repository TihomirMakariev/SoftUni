package Java_Advanced.DefiningClassesExercise.Google;

public class Car {
    private String carModel;
    private int carSpeed;

    public Car(String carModel, int carSpeed){
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return carModel + " " + carSpeed;
    }
}