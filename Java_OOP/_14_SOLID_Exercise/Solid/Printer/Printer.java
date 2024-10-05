package Java_OOP._14_SOLID_Exercise.Solid.Printer;

import Java_OOP._14_SOLID_Exercise.Solid.Calculator.Calculator;
import Java_OOP._14_SOLID_Exercise.Solid.Calculator.CalorieCalculator;
import Java_OOP._14_SOLID_Exercise.Solid.Products.Product;

import java.util.List;

public class Printer {
    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";
    private Calculator calculator;

    public Printer(Calculator calculator) {
        this.calculator = calculator;
    }

    public void printSum(List<Product> products) {
        System.out.printf((SUM) + "%n", calculator.sum(products));
    }

    public void printAverage(List<Product> products) {
        System.out.printf((AVERAGE) + "%n", calculator.average(products));
    }
}
