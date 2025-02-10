package com.example;

import com.example.shapes.Circle;
import com.example.shapes.Line;
import com.example.shapes.Point;
import com.example.shapes.Rectangle;
import com.example.shapes.Square;
import com.example.shapes.Triangle;

/**
 * `DrawingApp` は、様々な図形を作成して表示するアプリケーション
 */
public class DrawingApp {
    public static void main(String[] args) {
        // 図形のオブジェクトを作成
        Circle circle = new Circle("Red", 5.0);
        Triangle triangle = new Triangle("Blue", 3.0, 4.0);
        Rectangle rectangle = new Rectangle("Green", 6.0, 2.0);
        Square square = new Square("Yellow", 4.0);
        Point point = new Point("Black", 2.0, 3.0);
        Line line = new Line("Gray", 1.0, 1.0, 4.0, 4.0);

        // 各図形を描画
        circle.draw();
        System.out.println("Area: " + circle.getArea());

        triangle.draw();
        System.out.println("Area: " + triangle.getArea());

        rectangle.draw();
        System.out.println("Area: " + rectangle.getArea());

        square.draw();
        System.out.println("Area: " + square.getArea());

        point.draw();
        System.out.println("Area: " + point.getArea());

        line.draw();
        System.out.println("Area: " + line.getArea());
    }
}
