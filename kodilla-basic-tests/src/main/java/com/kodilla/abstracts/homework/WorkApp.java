package com.kodilla.abstracts.homework;

public class WorkApp {
    public static void main(String[] args) {

        Person mateusz = new Person("Mateusz", 30, "Manager") {
            @Override
            public void showData() {
                System.out.println(getFirstName() + ", " + getAge() + " lat, zawód - " + getJob());
            }
        };

        mateusz.showData();


        Job manager = new Manager();
        System.out.println("Responsibilities of Manager: " + manager.getResponsibilities());

        Person klaudia = new Person("Klaudia", 27, "Physical") {
            @Override
            public void showData() {
                System.out.println(getFirstName() + ", " + getAge() + " lat, zawód - " + getJob());
            }
        };

        klaudia.showData();

        Job physical = new Physical();
        System.out.println("Responsibilities of Physical: " + physical.getResponsibilities());
        }
    }
