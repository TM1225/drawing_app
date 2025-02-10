package com.example.shapes;

import com.example.models.Figure; // Figure インターフェースを import

/**
 * `Shape` クラスは、すべての図形の基本となる抽象クラス
 * `Figure` インターフェースを実装し、色のプロパティを持つ
 */
public abstract class Shape implements Figure {
	protected String color; // 図形の色

	/**
	 * `Shape` クラスのコンストラクタ
	 * @param color 図形の色
	 */
	public Shape(String color) {
		this.color = color;
	}

	/**
	 * 図形の色を取得する
	 * @return 図形の色
	 */
	public String getColor() {
		return color;
	}

	/**
	 * `draw()` メソッドは各サブクラス（Circle, Rectangle, Triangle, Polygon）で実装する
	 */
	@Override
	public abstract void draw();

	/**
	 * `getArea()` メソッドを強制的に実装させる
	 * @return 図形の面積
	 */
	@Override
	public abstract double getArea();
}
