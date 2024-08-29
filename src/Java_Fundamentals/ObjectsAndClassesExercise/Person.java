package Java_Fundamentals.ObjectsAndClassesExercise;

public class Person {
    //полета - fields -> ХАРАКТЕРИСТИКИТЕ на ОБЕКТЪТ;
    private String name; // задаване на тип и име на полето
    private int age;
    private String egn;

    public Person(String name, int age, String egn){
        this.name = name;
        this.age = age;
        this.egn = egn;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if (name.length()<3){
        }
        this.name = name;
    }

    //методи - methods -> ДЕЙСТВИЯТА на ОБЕКТЪТ, които ще извършва
    public void walk () {
        System.out.println("Walk");
        System.out.println("Walk");
        System.out.println("Walk");
        System.out.println("Walk");
        System.out.println("Walk");
    }
}
