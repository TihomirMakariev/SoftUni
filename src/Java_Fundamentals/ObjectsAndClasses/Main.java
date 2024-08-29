package Java_Fundamentals.ObjectsAndClasses;

public class Main {

    public static void main(String[] args) {
        Dice myDice = new Dice(6, "Blue");
        Dice mySecondDIce = new Dice();
        System.out.println();
        myDice.roll();

    }
}
