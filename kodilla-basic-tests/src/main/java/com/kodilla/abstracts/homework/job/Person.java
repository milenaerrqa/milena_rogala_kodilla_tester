package com.kodilla.abstracts.homework.job;

import java.util.Scanner;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    Scanner scanner = new Scanner(System.in);
    Accountant accountant;
    Doctor doctor;
    Programmer programmer;

    public Person() {
        this.firstName = firstName;
        this.age = age;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Job returnEmployeeJob() {
        System.out.println("Enter first name:");
        firstName = scanner.nextLine();
        setFirstName(firstName);

        System.out.println("Enter age:");
        age = scanner.nextInt();
        setAge(age);

        System.out.println("Select job: enter 1 for Accountant; 2 for Doctor, 3 for Programmer");
        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                job = accountant;
                setJob(new Accountant());
                break;
            case 2:
                job = doctor;
                setJob(new Doctor());
                break;
            case 3:
                job = programmer;
                setJob(new Programmer());
                break;
            default:
                System.out.println("Enter correct number");
        }
        return job;
    }

    public void displayEmployeeDetails(Job job) {
        System.out.println("Employee " + getFirstName() + ", age " + getAge());
        job.displayJobDetails();
    }
}
