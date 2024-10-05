package Java_OOP._09_InterfacesAndAbstraction.SayHelloExtend_04;

public class Chinese extends BasePerson {
    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
