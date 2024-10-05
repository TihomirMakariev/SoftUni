package Java_Fundamentals.ObjectsAndClasses;

public class Person {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public static boolean isOlderThan30(Person person) {
        return person.age > 30;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.age = 34;

        boolean isOld = Person.isOlderThan30(person);

        System.out.println("Is older than 30: " + isOld);

    }






















    /*public void setName(String name) {
        this.name = name;
    }

    public static boolean isOlderThan30(Person person) {
        return person.age > 30;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.age = 35;

       boolean isOld = Person.isOlderThan30(person);
        System.out.println("Is older than 30: " + isOld);
    }*/


}
