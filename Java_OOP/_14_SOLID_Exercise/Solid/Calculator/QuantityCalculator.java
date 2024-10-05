package Java_OOP._14_SOLID_Exercise.Solid.Calculator;

import Java_OOP._14_SOLID_Exercise.Solid.Products.Drink.Drink;
import Java_OOP._14_SOLID_Exercise.Solid.Products.Food.Food;
import Java_OOP._14_SOLID_Exercise.Solid.Products.Product;

import java.util.List;

public class QuantityCalculator implements Calculator{

    @Override
    public double sum(List<Product> products) {
        double sum = 0;
        for (Product product : products) {
            if (product instanceof Drink) {
                sum += ((Drink) product).getLiters();
            } else if (product instanceof Food) {
                sum +=(((Food) product).getKilograms());
            }
        }
        return sum;
    }

    @Override
    public double average(List<Product> products) {
        return sum(products) / products.size();
    }
}
