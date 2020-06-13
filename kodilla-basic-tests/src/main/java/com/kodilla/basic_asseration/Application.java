package com.kodilla.basic_asseration;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.addNumbers(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);

        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtractNumbers(a, b);
        boolean correctSubtr = ResultChecker.assertEquals(3, subtractResult);

        if (correctSubtr) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squareResult = calculator.squareNumber(a, b);
        boolean correctSquared = ResultChecker.assertEquals(390625, squareResult);

        if (correctSubtr) {
            System.out.println("Metoda square działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
