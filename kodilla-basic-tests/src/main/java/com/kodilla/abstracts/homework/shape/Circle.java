package com.kodilla.abstracts.homework.shape;

public class Circle extends Shape {
    private double circleRay;
    private final double PI = Math.PI;


    public Circle(double circleRay) {
        super("Circle");
        this.circleRay = circleRay;
    }

    @Override
    public double countSurfaceArea() {
        return PI * (int) Math.pow(circleRay, 2);
    }

    @Override
    public double countPerimeter() {
        return 2 * PI * circleRay;
    }
}
