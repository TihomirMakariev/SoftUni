package Java_Advanced._14_DefiningClassesExercise.OpinionPoll;

public class Person {
    //полета
   private String name;
   private int age;

   //методи

    //конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
