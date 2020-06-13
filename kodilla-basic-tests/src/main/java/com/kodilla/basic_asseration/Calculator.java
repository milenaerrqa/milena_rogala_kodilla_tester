package com.kodilla.basic_asseration;

public class Calculator {
    private int a;
    private int b;
    private int result;

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public int subtractNumbers(int a, int b) {
        return b - a;
    }

    public int squareNumber(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
