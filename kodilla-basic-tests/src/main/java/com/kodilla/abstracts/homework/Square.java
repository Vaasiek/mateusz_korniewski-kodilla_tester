package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public Square() {
        super(3, 3, 0, 3);
    }

    @Override
    public void obliczPole() {
        int poleKwadratu;
        poleKwadratu = getPierwszyBok() * getDrugiBok();
        System.out.println("Pole kwadratu wynosi: " + poleKwadratu);
    }

    @Override
    public void obliczObwod() {
        int obwodKwadratu;
        obwodKwadratu = 4 * getPierwszyBok();
        System.out.println("Obwód kwadratu wynosi: " + obwodKwadratu);

    }
}
