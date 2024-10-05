package Java_OOP._14_SOLID_Exercise.Solid;

import Java_OOP._14_SOLID_Exercise.Solid.Calculator.CalorieCalculator;
import Java_OOP._14_SOLID_Exercise.Solid.Calculator.QuantityCalculator;
import Java_OOP._14_SOLID_Exercise.Solid.Printer.Printer;
import Java_OOP._14_SOLID_Exercise.Solid.Products.Food.Chips;
import Java_OOP._14_SOLID_Exercise.Solid.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CalorieCalculator calorieCalculator = new CalorieCalculator();
        QuantityCalculator quantityCalculator = new QuantityCalculator();

        Printer printer1 = new Printer(calorieCalculator);
        Printer printer2 = new Printer(quantityCalculator);







    }
}
