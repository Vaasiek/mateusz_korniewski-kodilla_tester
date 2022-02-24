package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    public Triangle() {
        super(8, 5, 9.43, 5);
    }

    @Override
    public void obliczPole() {
        double poleTrojkata;
        poleTrojkata = (getPierwszyBok() * getWysokosc()) / 2;
        System.out.println("Pole trójkąta wynosi: " + poleTrojkata);
    }

    @Override
    public void obliczObwod() {
        double obwodTrojkata;
        obwodTrojkata = getPierwszyBok() + getDrugiBok() + getTrzeciBok();
        System.out.println("Obwód trójkąta wynosi: " + obwodTrojkata);
    }
}
