package com.example.shapes;

public class Line extends Shape {
    private final Point start;  // 直線の始点
    private final Point end;    // 直線の終点

    // Line クラスのコンストラクタ
    public Line(double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);  // 始点をPointオブジェクトとして設定
        this.end = new Point(x2, y2);    // 終点をPointオブジェクトとして設定
    }

    // 描画メソッド
    @Override
    public void draw() {
        System.out.println("Line: (" + start + " to " + end + ")");
    }

    // 直線の長さを計算して返すメソッド
    @Override
    public double getPerimeter() {
        return distance(start, end);  // 始点と終点の距離を計算して返す
    }

    // 2点間の距離を計算するメソッド
    private double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }
}

