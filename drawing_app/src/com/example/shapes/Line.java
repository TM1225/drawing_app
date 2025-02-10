package com.example.shapes;

public class Line extends Shape {
    private final Point start;
    private final Point end;

    public Line(double x1, double y1, double x2, double y2) {
        super();
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    @Override
    public void draw() {
        System.out.println("Line: (" + start + " to " + end + ") / 直線: (" + start + " から " + end + ")");
    }


    @Override
    public double getPerimeter() {
        return distance(start, end);
    }

    private double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }
}
