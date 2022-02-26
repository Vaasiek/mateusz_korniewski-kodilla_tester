package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metooda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int c = 10;
        int d = 3;

        int subResult = calculator.substract(c, d);
        boolean correct1 = ResultChecker.assertEquals(7, subResult);
        if (correct1) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda substract działa poprawnie dla liczb " + c + " i " + d);
        }

        int e = 12;

        int squareResult = calculator.squaring(e);
        boolean correct2 = ResultChecker.assertEquals(144, squareResult);
        if (correct2) {
            System.out.println("Metoda squarting działa poprawnie dla liczby " + e);
        } else {
            System.out.println("Metoda squarting nie działą poprawnie dla liczby " + e);
        }
    }
}
