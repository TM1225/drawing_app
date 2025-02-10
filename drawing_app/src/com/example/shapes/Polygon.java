package com.example.shapes;

public abstract class Polygon extends Shape {
    public Polygon() {
        super(); // Shape のコンストラクタを呼び出す
    }

    @Override
    public abstract void draw();

    @Override
    public abstract double getPerimeter();
}
