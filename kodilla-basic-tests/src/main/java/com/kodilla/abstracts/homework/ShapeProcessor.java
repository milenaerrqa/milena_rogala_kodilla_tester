package com.kodilla.abstracts.homework;

public class ShapeProcessor {
    public void process(Shape shape) {
        System.out.println(shape.getName() + " has surface area = " + shape.countSurfaceArea());
        System.out.println(shape.getName() + " has perimeter = " + shape.countPerimeter());
    }
}
