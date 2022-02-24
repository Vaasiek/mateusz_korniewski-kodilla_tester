package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int pierwszyBok;
    private int drugiBok;
    private double trzeciBok;
    private int wysokosc;

    public Shape(int pierwszyBok, int drugiBok, double trzeciBok, int wysokosc) {
        this.pierwszyBok = pierwszyBok;
        this.drugiBok = drugiBok;
        this.trzeciBok = trzeciBok;
        this.wysokosc = wysokosc;
    }

    public int getPierwszyBok() {
        return pierwszyBok;
    }

    public int getDrugiBok() {
        return drugiBok;
    }

    public double getTrzeciBok() {
        return trzeciBok;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public abstract void obliczPole();

    public abstract void obliczObwod();
}
