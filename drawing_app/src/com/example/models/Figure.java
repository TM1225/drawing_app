package com.example.models;

/**
 * 図形（Figure）を表すインターフェース
 * すべての図形クラスがこのインターフェースを実装する
 */
public interface Figure {

    /**
     * 図形を描画するメソッド
     * 具体的な描画処理は各図形クラスで実装する
     */
    void draw();

    /**
     * 図形の面積を計算するメソッド
     * @return 面積の値
     */
    double getArea();
}
