package com.example.shapes;

public class Circle extends Shape {

	private final double radius; // 円の半径

	public Circle(double radius) {

		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle: 半径 = " + radius);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius; // 円周の長さ
	}
}
