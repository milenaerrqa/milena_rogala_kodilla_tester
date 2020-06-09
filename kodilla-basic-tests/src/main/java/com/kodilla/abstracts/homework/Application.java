package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Circle circle = new Circle(12.1);
        Triangle triangle = new Triangle(12, 1.2, 23, 10);
        Square square = new Square(12.1);

        ShapeProcessor processor = new ShapeProcessor();
        processor.process(circle);
        processor.process(triangle);
        processor.process(square);
    }
}






