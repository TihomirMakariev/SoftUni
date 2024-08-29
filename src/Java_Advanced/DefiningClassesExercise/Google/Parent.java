package Java_Advanced.DefiningClassesExercise.Google;

public class Parent {
    //parentName, parentBirthday
    private String parentName;
    private String parentBirthday;

    public Parent(String parentName, String parentBirthday){
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }

    @Override
    public String toString() {
        return parentName + " " + parentBirthday;
    }
}
