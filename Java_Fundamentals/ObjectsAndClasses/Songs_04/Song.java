package Java_Fundamentals.ObjectsAndClasses.Songs_04;

public class Song {

    private String typeList;
    private String name;
    private String time;

    public Song() {

    }

    public String getTypeList() {
        return typeList;
    }

    public Song setTypeList(String typeList) {
        this.typeList = typeList;
        return this;
    }

    public String getName() {
        return name;
    }

    public Song setName(String name) {
        this.name = name;
        return this;
    }

    public String getTime() {
        return time;
    }

    public Song setTime(String time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return typeList;
    }
}
