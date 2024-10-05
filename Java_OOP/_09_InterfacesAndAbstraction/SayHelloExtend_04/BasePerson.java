package Java_OOP._09_InterfacesAndAbstraction.SayHelloExtend_04;

public abstract class BasePerson implements Person{
    private String name;

    protected BasePerson (String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    // Абстрактен метод sayHello() трябва да се имплементира в конкретните класове
    @Override
    public abstract String sayHello();

}
