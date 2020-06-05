package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(2, 3);
        car.turnOnLights();

        Convertible convertible = new Convertible(10, 11);
        convertible.turnOnLights();
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();
    }
}
