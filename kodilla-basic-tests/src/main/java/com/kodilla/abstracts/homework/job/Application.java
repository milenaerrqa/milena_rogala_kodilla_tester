package com.kodilla.abstracts.homework.job;

public class Application {

    public static void main(String[] args) {
       Person person = new Person();
       person.addPerson();
       person.displayPersonDetails();
       person.displayPersonResponsibilities(person.getJob());
    }
}
