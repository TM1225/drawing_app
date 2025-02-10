package com.example.shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);  // Rectangleクラスのコンストラクタを呼び出す
    }

    @Override
    public void draw() {
        System.out.println("Square: side = " + getWidth());  // getWidth()を使用
    }
}
