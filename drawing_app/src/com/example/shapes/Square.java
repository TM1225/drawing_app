package com.example.shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);  // Rectangleクラスのコンストラクタを呼び出す
    }

    @Override
    public void draw() {
        // 正方形の描画メッセージだけ表示
        System.out.println("Square: 辺の長さ = " + getWidth());
    }
}
