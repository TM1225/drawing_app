package com.example.shapes;

/**
 * 多角形を表す抽象クラス
 * `Shape` クラスを継承し、多角形の共通処理を定義する
 */
public abstract class Polygon extends Shape {

    /**
     * コンストラクタ
     * @param color 多角形の色
     */
    public Polygon(String color) {
        super(color); // `Shape` クラスのコンストラクタを呼び出す
    }

    @Override
    public void draw() {
        // 実装内容
    }
}
