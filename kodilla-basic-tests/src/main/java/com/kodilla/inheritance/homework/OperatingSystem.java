package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private String name;    //np. Windows, Linux, Mac
    private int publicYear;

    public OperatingSystem(int publicYear) {
        this.publicYear = publicYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    public void displaySystemInfo(String name, int publicYear) {
        System.out.println("System: " + name + " updated in " + publicYear);
    }

    public void turnOn(String name) {
        System.out.println(name + " system is turned on");
    }

    public void turnOff(String name) {
        System.out.println(name + " system is turned off");
    }
}
