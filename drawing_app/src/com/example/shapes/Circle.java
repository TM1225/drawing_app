package com.example.shapes;

/**
 * 円（Circle）を表すクラス
 * `Shape` クラスを継承し、円特有の処理を実装する
 */
public class Circle extends Shape {
    private final double radius; // 円の半径

    /**
     * コンストラクタ
     * @param color 円の色
     * @param radius 円の半径（0以上であること）
     * @throws IllegalArgumentException 半径が0以下の場合、エラーをスロー
     */
    public Circle(String color, double radius) {
        super(color);
        if (radius <= 0) {
            throw new IllegalArgumentException("半径は 0 より大きい値である必要があります。");
        }
        this.radius = radius;
    }

    /**
     * `draw()` メソッドの実装
     * 円の情報をコンソールに出力
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with color: " + color + ", radius: " + radius);
    }

    /**
     * 円の面積を計算する
     * @return 面積（πr²）を小数点2桁に丸めて返す
     */
    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area * 100.0) / 100.0; // 小数点2桁に丸める
    }
}
