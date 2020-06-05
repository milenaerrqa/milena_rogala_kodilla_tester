package com.kodilla.inheritance;

public class Convertible extends Car{

    public Convertible(int wheels, int seats) {
        super(wheels, seats);
        System.out.println("Convertible constructor");
    }

    public void openRoof() {
        System.out.println("Open roof...");
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }

    public void openDoors() {
        System.out.println("Opening 2 doors");
    }
}
