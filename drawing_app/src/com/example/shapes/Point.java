package com.example.shapes;

public class Point extends Shape {
    private final double x;  // x座標を表すフィールド
    private final double y;  // y座標を表すフィールド

    // Point クラスのコンストラクタ
    public Point(double x, double y) {
        this.x = x;  // x座標の値を設定
        this.y = y;  // y座標の値を設定
    }

    // 描画メソッド
    @Override
    public void draw() {
        // 座標をコンソールに出力する
        System.out.println("Point: (" + x + ", " + y + ") / 点: (" + x + ", " + y + ")");
    }

    // 周囲長の取得メソッド
    @Override
    public double getPerimeter() {
        return 0.0;  // 点自体には周囲長がないため、0を返す
    }

    // x座標を返すメソッド
    public double getX() {
        return x;
    }

    // y座標を返すメソッド
    public double getY() {
        return y;
    }

    // 座標を文字列で表示するためにtoStringをオーバーライド
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
