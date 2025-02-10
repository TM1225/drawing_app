package com.example.shapes;

public class Rectangle extends Shape {
    protected final double width;  // 幅
    protected final double height; // 高さ

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 幅を取得するゲッター
    public double getWidth() {
        return width;
    }

    // 高さを取得するゲッター
    public double getHeight() {
        return height;
    }

    // 周囲長を計算するメソッド
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // 描画メソッドの実装
    @Override
    public void draw() {
    	 System.out.println("Rectangle: width = " + width + ", height = " + height + " / 長方形: 幅 = " + width + ", 高さ = " + height);
    }
}
