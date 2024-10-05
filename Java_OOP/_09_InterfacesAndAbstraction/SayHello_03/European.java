package Java_OOP._09_InterfacesAndAbstraction.SayHello_03;

public class European implements Person{
    private String name;


    public European(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
