package com.kodilla.inheritance.homework;

import java.util.Scanner;

public class Mobile extends OperatingSystem {

    private double versionNumber;  //wersja systemu operacyjnego numerowana za pomoca double
    Scanner scanner = new Scanner(System.in);

    public Mobile(int publicYear) {
        super(publicYear);
    }

    public double getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(double versionNumber) {
        this.versionNumber = versionNumber;
    }

    public void displaySystemInfo(String name, int publicYear, double versionNumber) {
        System.out.println("System: " + name + " updated in " + publicYear + " with version" + versionNumber);
    }

    public void turnOn(String name) {
        super.turnOn(name);   // wywolanie metody z bazowej klasy + z dziedziczonej
        System.out.println("Welcome in " + name );
    }

    public void turnOff(String name) {
        super.turnOff(name);
        System.out.println(name + " says goodbye!");
    }

    public void setMobileDetails() {

        System.out.println("Enter system name");
        String name = scanner.nextLine();
        setName(name);

        System.out.println("Enter version number");
        double versionNumber = scanner.nextDouble();
        setVersionNumber(versionNumber);
    }
}
