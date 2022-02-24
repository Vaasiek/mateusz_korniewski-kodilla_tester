package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape square = new Square();
        square.obliczObwod();
        square.obliczPole();

        Shape rectangle = new Rectangle();
        rectangle.obliczObwod();
        rectangle.obliczPole();

        Shape triangle = new Triangle();
        triangle.obliczObwod();
        triangle.obliczPole();
    }
}
