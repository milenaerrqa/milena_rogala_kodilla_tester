package com.kodilla.inheritance.homework;

import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {
     int userSelection;
     Scanner scanner = new Scanner(System.in);
     Desktop desktop;
     Mobile mobile;

     System.out.println("Enter a public year of operation system");
     int publicYear = scanner.nextInt();

     System.out.println("What system you want to turn on?");
     System.out.println("If desktop system: ENTER 1; mobile system: ENTER 2");
     userSelection = scanner.nextInt();

     switch(userSelection) {
         case 1 : desktop = new Desktop(publicYear);
                    desktop.setDesktopDetails();
                    desktop.turnOn(desktop.getVersionName());
                    desktop.turnOff(desktop.getName(), desktop.getVersionName(), desktop.getVersionNumber());
                    break;
         case 2 : mobile = new Mobile(publicYear);
                    mobile.setMobileDetails();
                    mobile.turnOn(mobile.getName());
                    mobile.turnOff(mobile.getName());
                    break;
         default: System.out.println("Enter the correct digit!");
         }
    }
}
