package Java_OOP._10_InterfacesAndAbstraction_Exercise.BirthdayCelebrations_03;

public class Robot implements Identifiable{

    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
