package Java_Fundamentals.ObjectsAndClasses.Stidents_06_02.Stidents_06;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public Student() {}

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }


    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;

    }

    public String getHomeTown() {
        return homeTown;
    }

    public Student setHomeTown(String homeTown) {
        this.homeTown = homeTown;
        return this;
    }

}
