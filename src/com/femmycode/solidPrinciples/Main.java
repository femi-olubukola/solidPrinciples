package com.femmycode.solidPrinciples;

import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle();
        Square square = new Square();

        List<Objects> shapes = List.of(circle, square);
        int sum = areaCalculator.sum(shapes);
        System.out.println("Sum = " + sum);

    }
}
