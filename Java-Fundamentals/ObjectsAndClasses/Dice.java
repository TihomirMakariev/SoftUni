package ObjectsAndClasses;

import java.util.Random;

public class Dice {
    private int sides;
    private String color;

    public Dice (){

    }
    public Dice (int sides, String color){
        this.sides = sides;
        this.color = color;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int number) {
        sides = number;
    }

    public int roll() {
        Random random = new Random();
        int number = random.nextInt(sides) +1;
        return number;
    }
}
