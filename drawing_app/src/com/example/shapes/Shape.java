package com.example.shapes;

public abstract class Shape {
    // 図形クラスには描画機能と周囲長計算機能が共通
    public abstract void draw();   // 各図形クラスで描画の内容を実装
    public abstract double getPerimeter();  // 周囲長を計算
}
