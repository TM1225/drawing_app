package com.example.shapes;

import com.example.models.Figure;

/**
 * 直線(Line)を表すクラス
 * `Figure` インターフェースを実装し、始点と終点を持つ
 */
public class Line implements Figure {
    private final String color; // 直線の色
    private final double startX;
    private final double startY;
    private final double endX;
    private final double endY;

    /**
     * コンストラクタ
     * @param color 直線の色
     * @param startX 始点のX座標
     * @param startY 始点のY座標
     * @param endX 終点のX座標
     * @param endY 終点のY座標
     */
    public Line(String color, double startX, double startY, double endX, double endY) {
        this.color = color;
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    /**
     * `draw()` メソッドの実装
     * 直線の情報を出力
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Line with color: " + color + ", from (" + startX + ", " + startY + ") to (" + endX + ", " + endY + ")");
    }

    /**
     * 直線の長さを計算する
     * @return 直線の長さ（√((x2 - x1)² + (y2 - y1)²)）
     */
    public double getLength() {
        return Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
    }

    /**
     * 直線の面積は 0
     * `Shape` を継承しないため、このメソッドは不要
     */
    @Override
    public double getArea() {
        return 0; // 直線の面積は存在しない
    }
}
