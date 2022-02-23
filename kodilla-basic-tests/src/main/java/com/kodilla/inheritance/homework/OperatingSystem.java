package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int release;

    public OperatingSystem(int release) {
        this.release = release;
    }

    public void turnOn() {
        System.out.println("Turning system on...");
    }

    public void turnOff() {
        System.out.println("Turning system off...");
    }

    public int getRelease() {
        return release;
    }
}
