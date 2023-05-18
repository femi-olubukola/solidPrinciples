package com.femmycode.solidPrinciples;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Object> shapes) {

        int sum1 = 0;

        for (int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);

            if (shape instanceof Square) {
                sum1 += Math.pow(((Square) shape).getLength(), 2);
            }

            if (shape instanceof Circle) {
                sum1 += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
        }
        return sum1;
    }

}
