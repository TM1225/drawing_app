package com.example.shapes;

public class Circle extends Shape {
    private final double radius;  // 半径を保持するフィールド

    // Circle クラスのコンストラクタ
    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("半径は 0 より大きい必要があります。");
        }
        this.radius = radius;  // 半径を設定
    }

    // 描画メソッド
    @Override
    public void draw() {
        // 半径を表示
        System.out.println("Circle: 半径 = " + radius);
    }

    // 周囲長（円周）を計算して返すメソッド
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;  // 2πr で円周を計算
    }
}