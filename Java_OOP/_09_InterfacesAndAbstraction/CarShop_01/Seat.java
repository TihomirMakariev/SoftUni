package Java_OOP._09_InterfacesAndAbstraction.CarShop_01;

public class Seat implements Car{

    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;


    public Seat (String model, String color, int horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String getCountryProduced() {
        return countryProduced;
    }

    @Override
    public String toString() {
        return

                "This is %s produced in %s and have %d tires".formatted(getModel(),
                        getCountryProduced(), TIRES);
    }
}
