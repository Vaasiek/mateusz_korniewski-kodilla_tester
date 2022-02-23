package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    public Linux(int release) {
        super(release);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning Linux on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Linux off...");
    }
}
