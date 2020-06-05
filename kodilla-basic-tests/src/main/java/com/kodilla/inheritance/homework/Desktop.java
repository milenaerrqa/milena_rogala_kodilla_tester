package com.kodilla.inheritance.homework;

import java.util.Scanner;

public class Desktop extends OperatingSystem {

    private int versionNumber;   //wersja systemu operacyjnego numerowana za pomoca int
    private String versionName;      //np. XP, 10 Pro, Tiger, Catalina, Fedora
    Scanner scanner = new Scanner(System.in);

    public Desktop(int publicYear) {
        super(publicYear);
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getVersionName() {
        return  versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public void displaySystemInfo(String name, int publicYear, double versionNumber) {
        System.out.println("System: " + name + " " + versionName + "updated in " + publicYear + " with version" + versionNumber);
    }

    public void turnOn(String name, int versionNumber) {
        System.out.println("Welcome in " + name + versionName + " " + versionNumber);
    }

    public void turnOff(String name, String versionName, int versionNumber) {
        System.out.println(name + " " + versionName + " " + versionNumber + " says goodbye!");
    }

    public void setDesktopDetails() {

        System.out.println("Enter system name");
        String name = scanner.nextLine();
        setName(name);

        System.out.println("Enter version name");
        String versionName = scanner.nextLine();
        setVersionName(versionName);

        System.out.println("Enter version number");
        int versionNumber = scanner.nextInt();
        setVersionNumber(versionNumber);
    }
}
