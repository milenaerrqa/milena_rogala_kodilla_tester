package com.kodilla.basic_assertion;

import com.kodilla.basic_asseration.Calculator;
import org.junit.jupiter.api.Test;
import static java.lang.Double.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTestSuite {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int a = 5;
        int b = 8;

        int addNumbers = calculator.addNumbers(a, b);
        assertEquals(13, addNumbers);
    }

    @Test
    public void testSubstr() {
        int a = 5;
        int b = 8;

        int subtrResult = calculator.subtractNumbers(a, b);
        assertEquals(3, subtrResult);
    }

    @Test
    public void testPow() {
        int a = 5;
        int b = 2;

        double powResult = calculator.powNumbers(a, b);
        assertEquals(25, powResult);
    }

    @Test
    public void testPowWhenNumbersAreSmallerThanZero() {                                    // x < 0, Y < 0, result > 0
        int x = -1;
        int y = -4;

        double powResult = calculator.powNumbers(x, y);
        assertTrue(powResult > 0);
    }

    @Test
    public void testPowWhenNumbersAreEqualToZero() {                                     // x == 0, y == 0, result == 1
        int x = 0;
        int y = 0;

        double powResult = calculator.powNumbers(x, y);
        assertEquals(1, powResult);
    }

    @Test
    public void testPowWhenNumbersAreGreaterThanZero() {                                    // x > 0, y > 0, result > 0
        int x = 2;
        int y = 3;

        double powResult = calculator.powNumbers(x, y);
        assertTrue(powResult > 0);
    }

    @Test
    public void testPowWhenNumberIsSmallerThanZeroAndIndexIsEqualToZero() {               // x < 0, y == 0, result == 1
        int x = -2;
        int y = 0;

        double powResult = calculator.powNumbers(x, y);
        assertEquals(1, powResult);
    }

    @Test
    public void testPowWhenNumberIsSmallerThanZeroAndEvenIndexIsGreaterThanZero() {    // x < 0, even y > 0, result > 0
        int x = -2;
        int y = 4;
        int modResult = y % 2;

        double powResult = calculator.powNumbers(x, y);
        assertTrue(modResult == 0 && powResult > 0);
    }

    @Test
    public void testPowWhenNumberIsSmallerThanZeroAndUnevenIndexIsGreaterThanZero() {// x < 0, uneven y > 0, result < 0
        int x = -2;
        int y = 5;
        int modResult = y % 2;

        double powResult = calculator.powNumbers(x, y);
        assertTrue(modResult != 0 && powResult < 0);
    }

    @Test
    public void testPowWhenNumberIsEqualToZeroAndIndexIsSmallerThanZero() {        // x == 0, y < 0, result == INFINITY
        int x = 0;
        int y = -4;
        double powResult = calculator.powNumbers(x, y);

        assertEquals(POSITIVE_INFINITY, powResult);
    }

    @Test
    public void testPowWhenNumberIsEqualToZeroAndIndexIsGreaterThanZero() {               // x == 0, y > 0, result == 0
        int x = 0;
        int y = 6;
        double powResult = calculator.powNumbers(x, y);

        assertEquals(0, powResult);
    }

    @Test
    public void testPowWhenNumberIsGreaterThanZeroAndIndexIsSmallerThanZero() {             // x > 0, y < 0, result > 0
        int x = 2;
        int y = -6;
        double powResult = calculator.powNumbers(x, y);

        assertTrue(powResult > 0);
    }

    @Test
    public void testPowWhenNumberIsGreaterThanZeroAndIndexIsEqualToZero() {               // x > 0, y == 0, result == 1
        int x = 2;
        int y = 0;
        double powResult = calculator.powNumbers(x, y);

        assertEquals(1, powResult);
    }
}
