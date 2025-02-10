package com.example.shapes;

/**
 * 三角形（Triangle）を表すクラス
 * `Polygon` クラスを継承し、三角形特有の処理を実装する
 */
public class Triangle extends Polygon {
    private final double base;  // 底辺をfinalに変更
    private final double height; // 高さをfinalに変更

    /**
     * コンストラクタ
     * @param color 三角形の色
     * @param base 底辺の長さ
     * @param height 高さの長さ
     */
    public Triangle(String color, double base, double height) {
        super(color); // `Polygon` クラスのコンストラクタを呼び出し、色を設定
        this.base = base;
        this.height = height;
    }

    /**
     * `draw()` メソッドの実装
     * 三角形の情報を出力する
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle with color: " + color + ", base: " + base + ", height: " + height);
    }

    /**
     * 三角形の面積を計算する
     * @return 面積（(底辺 × 高さ) / 2）
     */
    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
