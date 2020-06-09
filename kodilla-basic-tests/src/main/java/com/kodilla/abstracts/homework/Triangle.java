package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private double height;
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(double height, double aSide, double bSide, double cSide) {
        super("Triangle");
        this.height = height;
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    public double countSurfaceArea() {
        return 0.5 * aSide * height;
    }

    @Override
    public double countPerimeter() {
        return aSide + bSide + cSide;
    }
}
