package Java_OOP._09_InterfacesAndAbstraction.CarShopExtend_02;

public class Seat extends CarImp implements Sellable{
    private Double price;

    public Seat(String model, String color, int horsePower, String countryProduced, Double price) {
        // Извикваме конструктора на базовия клас CarImp
        super (model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s sells for %.2f", getModel(), price);
    }
}
