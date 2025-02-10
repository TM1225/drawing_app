package com.example.shapes;

public class Point extends Shape {
    private final double x;
    private final double y;

    // Point クラスのコンストラクタ
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
    	 System.out.println("Point: (" + x + ", " + y + ") / 点: (" + x + ", " + y + ")");
    }

    @Override
    public double getPerimeter() {
        return 0.0;
    }

    // x座標を取得するメソッド
    public double getX() {
        return x;
    }

    // y座標を取得するメソッド
    public double getY() {
        return y;
    }

    // Point クラスで toString() をオーバーライドして座標を表示
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
