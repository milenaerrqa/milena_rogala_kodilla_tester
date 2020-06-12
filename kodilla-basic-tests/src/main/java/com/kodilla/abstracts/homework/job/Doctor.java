package com.kodilla.abstracts.homework.job;

public class Doctor extends Job {

    public Doctor() {
        super(7500.50, "Doctor job description:" + "\n"
                + "1. undertaking patient consultations and physical examinations,"
                + "\n" + "2. performing surgical procedures," + "\n" + "3. monitoring and administering medication." );
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Doctor's salary: " + getSalary());
        System.out.println(getResponsibilities());
    }
}
