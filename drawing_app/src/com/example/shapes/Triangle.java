package com.example.shapes;

public class Triangle extends Polygon {
    private final Point p1;
    private final Point p2;
    private final Point p3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super();
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
        this.p3 = new Point(x3, y3);
    }

    @Override
    public void draw() {
    	System.out.println("Triangle: (" + p1 + "), (" + p2 + "), (" + p3 + ") ");
    }

    @Override
    public double getPerimeter() {
        double side1 = distance(p1, p2);
        double side2 = distance(p2, p3);
        double side3 = distance(p3, p1);
        return side1 + side2 + side3;
    }

    private double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }
}
