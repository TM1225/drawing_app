package com.example.shapes;

/**
 * 長方形（Rectangle）を表すクラス
 * `Polygon` クラスを継承し、長方形特有の処理を実装する
 */
public class Rectangle extends Polygon {
    private final double width;
    private final double height;

    /**
     * コンストラクタ
     * @param color 長方形の色
     * @param width 幅
     * @param height 高さ
     */
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    /**
     * `draw()` メソッドの実装
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with color: " + color + ", width: " + width + ", height: " + height);
    }

    /**
     * 長方形の面積を計算する
     * @return 面積（幅 × 高さ）
     */
    @Override
    public double getArea() {
        return width * height;
    }
}
