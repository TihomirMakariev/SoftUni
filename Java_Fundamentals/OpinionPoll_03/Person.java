package Java_Fundamentals.OpinionPoll_03;

public class Person {
    //fields
    private String name;
    private int age;

    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        //Ivan - 48
        return name + " - " + age;
    }
}
