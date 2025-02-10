package com.example.shapes;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("半径は 0 より大きい必要があります。");
        }
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: radius = " + radius + " / 円: 半径 = " + radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
