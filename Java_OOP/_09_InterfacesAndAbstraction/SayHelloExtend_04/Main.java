package Java_OOP._09_InterfacesAndAbstraction.SayHelloExtend_04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Bulgarian("Peter"));
        persons.add(new European("Peter"));
        persons.add(new Chinese("Peter"));

        for (Person person : persons) {
            print(person);
        }

        Person person = new Bulgarian("Pesho");
        person.getName();
        System.out.println(person.getName());
    }

    private static void print(Person person) {
        System.out.println(person.sayHello());
    }
}
