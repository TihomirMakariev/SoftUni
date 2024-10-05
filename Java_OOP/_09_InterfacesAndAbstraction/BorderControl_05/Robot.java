package Java_OOP._09_InterfacesAndAbstraction.BorderControl_05;

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
        return id;
    }
}
