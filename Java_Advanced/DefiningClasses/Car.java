package Java_Advanced.DefiningClasses;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car() {
    }

    public Car (String brand){
        this(brand, "unknown",-1);
    }

    public Car(String brand, String model) {
        this(brand, model , -1);
    }

    public Car(String brand, int horsePower) {
        this(brand, "unknown", horsePower);
    }


    public Car(String brand, String model, int horsePower) {
        this.setBrand(brand);
        this.setModel(model);
        this.setHorsePower(horsePower);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower < 0) {
            horsePower = -1;
        }
        this.horsePower = horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getInfo() {
        return toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, horsePower);
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand(),
                this.getModel(),
                this.getHorsePower());
    }
}
