package Java_OOP._09_InterfacesAndAbstraction.SayHelloExtend_04;

public class European extends BasePerson {

    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
