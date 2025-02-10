package com.example;

import com.example.shapes.Circle;
import com.example.shapes.Line;
import com.example.shapes.Point;
import com.example.shapes.Rectangle;
import com.example.shapes.Square;
import com.example.shapes.Triangle;

public class DrawingApp {
    public static void main(String[] args) {
        // 図形のオブジェクトを作成
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(0, 0, 3, 0, 3, 4);
        Rectangle rectangle = new Rectangle(6.0, 2.0);
        Square square = new Square(4.0);  // Square オブジェクト
        Point point = new Point(2.0, 3.0);
        Line line = new Line(1.0, 1.0, 4.0, 4.0);

        // 各図形を描画
        circle.draw();
        System.out.println("Perimeter: " + circle.getPerimeter());

        triangle.draw();
        System.out.println("Perimeter: " + triangle.getPerimeter());

        rectangle.draw();
        System.out.println("Perimeter: " + rectangle.getPerimeter()); // Rectangle の周囲長を表示

        square.draw();  // Square の描画は Perimeter の表示なし

        point.draw();
        line.draw();
    }
}
