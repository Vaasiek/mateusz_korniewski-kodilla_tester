package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 3;
        int subResult = calculator.substract(a, b);
        assertEquals(7, subResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = -3;
        int squareResult = calculator.squaring(a);
        assertEquals(9, squareResult, 0.1);
    }

    @Test
    public void testSquare1() {
        Calculator calculator = new Calculator();
        int a = 0;
        int squareResult = calculator.squaring(a);
        assertEquals(0, squareResult, 0.1);
    }

    @Test
    public void testSquare2() {
        Calculator calculator = new Calculator();
        int a = 8;
        int squareResult = calculator.squaring(a);
        assertEquals(64, squareResult, 0.1);
    }
}
