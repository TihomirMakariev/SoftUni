package Java_OOP._14_SOLID_Exercise.Solid.Calculator;

import Java_OOP._14_SOLID_Exercise.Solid.Products.Product;

import java.util.List;

public interface Calculator {
    double sum(List<Product>products);
    double average(List<Product> products);
}
