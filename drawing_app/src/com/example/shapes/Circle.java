package com.example.shapes;

public class Circle extends Shape {
    private final Point center;  // 円の中心点
    private final double radius;  // 円の半径

    public Circle(double radius) {
        this.center = new Point(0, 0);  // 円の中心は (0, 0) に設定
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: 半径 = " + radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;  // 円周の長さ
    }
}
