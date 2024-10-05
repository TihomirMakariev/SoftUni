package Java_OOP._09_InterfacesAndAbstraction.CarShopExtend_02;

public class Audi extends CarImp implements Rentable{

    private int minRentDay;
    public Double pricePerDay;

    public Audi (String model, String color, int horsePower,
                 String countryProduced, int minRentDay, Double pricePerDay) {

        super(model, color, horsePower,countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePErDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        return String.format
                ("Audi rents for %.2f per day for a minimum of %d days", pricePerDay, minRentDay);
    }
}
