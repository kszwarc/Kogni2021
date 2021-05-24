package com.company.Part9;

public class Student {
    private String firstName;
    private String lastName;
    private int number;
    private static int counter;

    public Student() {
        counter++;
    }

    public void hi() {
        System.out.println(firstName + " " + lastName + " " + number);
    }

    public void howManyStudents() {
        System.out.println(counter);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
