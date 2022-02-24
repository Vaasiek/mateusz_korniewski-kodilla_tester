package com.kodilla.abstracts.homework;

public class Anna extends Person{
    public Anna() {
        super("Anna", 34, "Manager");
    }

    @Override
    public void showData() {
        System.out.println(getFirstName() + ", " + getAge() + " lat, zawód - " + getJob());
    }

}
