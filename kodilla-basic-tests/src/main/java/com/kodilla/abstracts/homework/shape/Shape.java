package com.kodilla.abstracts.homework.shape;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double countSurfaceArea();

    public abstract double countPerimeter();
}
