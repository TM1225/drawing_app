package com.example.shapes;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        // Rectangleの描画処理
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
