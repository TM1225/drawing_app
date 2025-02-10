package com.example.shapes;

/**
 * 正方形（Square）を表すクラス
 * `Rectangle` を継承し、幅と高さを同じ値にする
 */
public class Square extends Rectangle {
	private final double side; // 一辺の長さ

	/**
	 * コンストラクタ
	 * @param color 正方形の色
	 * @param side 一辺の長さ
	 */
	public Square(String color, double side) {
		super(color, side, side); // `Rectangle` のコンストラクタを呼び出す
		this.side = side;
	}

	/**
	 * `draw()` メソッドをオーバーライド
	 * `Rectangle` のものをそのまま使わず、明示的に正方形であることを示す
	 */
	@Override
	public void draw() {
		System.out.println("Drawing a Square with color: " + getColor() + ", side length: " + side);
	}

	/**
	 * 正方形の面積を計算する
	 * @return 面積（`side × side`）
	 */
	@Override
	public double getArea() {
		return side * side;
	}
}
