package com.example.models;

/**
 * 図形（Figure）を表すインターフェース
 * すべての図形クラスがこのインターフェースを実装する
 */
public interface Figure {
    void draw();
    double getPerimeter(); // 面積は不要
}
