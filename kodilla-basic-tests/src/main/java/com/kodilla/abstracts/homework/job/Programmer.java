package com.kodilla.abstracts.homework.job;

public class Programmer extends Job {

    public Programmer() {
        super(15684.25, "Programmer job description:" + "\n"
                + "1. coding and debugging," + "\n" + "2. designing and testing computer structures,"
                + "\n" + "3. writing computer instructions.");
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Programmer's salary: " + getSalary());
        System.out.println(getResponsibilities());
    }
}
