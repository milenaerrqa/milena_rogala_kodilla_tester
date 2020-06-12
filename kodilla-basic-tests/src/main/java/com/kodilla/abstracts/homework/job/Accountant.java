package com.kodilla.abstracts.homework.job;

public class Accountant extends Job {

    public Accountant() {
        super(4500.99, "Accountant job description:" + "\n" + "1. preparing accounts and tax returns," + "\n"
                + "2. administering payrolls and controlling income and expenditure," + "\n"
                + "3. analysing accounts and business plans.");
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Accountant's salary: " + getSalary());
        System.out.println(getResponsibilities());
    }
}