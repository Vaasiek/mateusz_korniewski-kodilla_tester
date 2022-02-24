package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    public Rectangle() {
        super(4, 7, 0, 4);
    }

    @Override
    public void obliczPole() {
        int poleProstokata;
        poleProstokata = getPierwszyBok() * getDrugiBok();
        System.out.println("Pole prostokąta wynosi: " + poleProstokata);

    }

    @Override
    public void obliczObwod() {
        int obwodProstokata;
        obwodProstokata = 2 * (getPierwszyBok() + getDrugiBok());
        System.out.println("Obwod prostokata wynosi: " + obwodProstokata);

    }
}
