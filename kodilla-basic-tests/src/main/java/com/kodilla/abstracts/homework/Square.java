package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double aSide;

    public Square(double aSide) {
        super("Square");
        this.aSide = aSide;
    }

    @Override
    public double countSurfaceArea() {
        return (int) Math.pow(aSide, 2);
    }

    @Override
    public double countPerimeter() {
        return 4 * aSide;
    }
}
