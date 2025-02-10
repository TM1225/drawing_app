package com.example.shapes;

import com.example.models.Figure;

/**
 * 点(Point)を表すクラス
 * `Figure` インターフェースを実装し、座標を持つ
 */
public class Point implements Figure {
    private final String color; // 点の色
    private final double x;
    private final double y;

    /**
     * コンストラクタ
     * @param color 点の色
     * @param x X座標
     * @param y Y座標
     */
    public Point(String color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    /**
     * `draw()` メソッドの実装
     * 点の情報を出力
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Point with color: " + color + ", at (" + x + ", " + y + ")");
    }

    /**
     * 点の面積は 0
     * `Shape` を継承しないため、このメソッドは不要
     */
    @Override
    public double getArea() {
        return 0; // 点の面積は存在しない
    }

    /**
     * 点の座標を取得する
     * @return 点の座標を (x, y) 形式で返す
     */
    public String getCoordinates() {
        return "(" + x + ", " + y + ")";
    }
}
