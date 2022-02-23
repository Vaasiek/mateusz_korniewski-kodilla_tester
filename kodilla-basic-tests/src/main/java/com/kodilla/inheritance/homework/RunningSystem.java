package com.kodilla.inheritance.homework;

public class RunningSystem {

    public static void main(String[] args) {

        Windows windows = new Windows(2021);
        windows.turnOn();
        windows.turnOff();

        Linux linux = new Linux(2000);
        linux.turnOn();
        linux.turnOff();
    }
}
