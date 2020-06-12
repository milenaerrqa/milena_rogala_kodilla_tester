package com.kodilla.abstracts.homework.job;

import java.util.Scanner;

public class Person {


    public Person() {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    private String firstName;
    private int age;
    private Job job;
    Scanner scanner = new Scanner(System.in);
    Accountant accountant = new Accountant();
    Doctor doctor = new Doctor();
    Programmer programmer = new Programmer();

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
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

    public Job addPerson() {
        System.out.println("Enter first name:");
        firstName = scanner.nextLine();
        setFirstName(firstName);
        System.out.println("Enter age:");
        age = scanner.nextInt();
        setAge(age);
        System.out.println("Select job: enter 1 for Accountant; 2 for Doctor, 3 for Programmer");
        int selection = scanner.nextInt();
        switch(selection) {
            case 1 : job = accountant;
                    setJob(job);
                break;
            case 2 : job = doctor;
                setJob(job);
                break;
            case 3: job = programmer;
                setJob(job);
                break;
            default: System.out.println("Enter correct number");
        }
        return job;
    }

    public void displayPersonDetails() {
        System.out.println("Employee " + getFirstName() + ", age " + getAge());
    }
    public void displayPersonResponsibilities(Job job) {
        job.displayJobDetails();
    }
}
