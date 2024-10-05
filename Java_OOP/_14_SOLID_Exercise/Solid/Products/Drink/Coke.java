package Java_OOP._14_SOLID_Exercise.Solid.Products.Drink;

import Java_OOP._14_SOLID_Exercise.Solid.Products.Product;

public class Coke implements Drink {
    public static final double CALORIES_PER_100_GRAMS = 44.0;
    public static final double DENSITY = 0.6;

    private double milliliters;

    public Coke(double milliliters) {
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }

    @Override
    public double getCalories() {
        double grams = getMilliliters() * Coke.DENSITY;
        return (Coke.CALORIES_PER_100_GRAMS / 100) * grams;
    }


    @Override
    public double getLiters() {
        return milliliters / 1000;
    }
}
