package Java_OOP._09_InterfacesAndAbstraction.SayHelloExtend_04;

public class Bulgarian extends BasePerson {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
