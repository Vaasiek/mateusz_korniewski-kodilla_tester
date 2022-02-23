package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int release) {
        super(release);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning Windows on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning Windows off..");
    }
}
