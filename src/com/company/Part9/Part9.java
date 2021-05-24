package com.company.Part9;

import java.util.Scanner;

public class Part9 {
    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.setFirstName("Jan");
        System.out.println(newStudent.getCounter());
        Student newStudent2 = new Student();
        newStudent2.setFirstName("Andrzej");
        new Student();
        System.out.println(newStudent.getFirstName());
        System.out.println(newStudent2.getFirstName());
        System.out.println(newStudent.getCounter());
        System.out.println(newStudent2.getCounter());
    }

    public static void approachThird() {
        Scanner reader = new Scanner(System.in);
        final byte NO_OF_EMPLOYEES = 2;
        Employee[] employees = new Employee[NO_OF_EMPLOYEES];
        double sum = 0;
        for (int i = 0; i < NO_OF_EMPLOYEES; i++) {
            employees[i] = new Employee();
            System.out.println("Podaj imię " + (i + 1) + " pracownika");
            employees[i].setFirstName(reader.nextLine());
            System.out.println("Podaj nazwisko " + (i + 1) + "  pracownika");
            employees[i].setLastName(reader.nextLine());
            System.out.println("Podaj pensję " + (i + 1) + " pracownika");
            employees[i].setSalary(Double.valueOf(reader.nextLine()));
            System.out.println("Podaj płeć " + (i + 1) + " pracownika");
            employees[i].setGender(reader.nextLine().charAt(0));
            sum += employees[i].getSalary();
        }
        double avgSalary = sum / NO_OF_EMPLOYEES;
        for (int i = 0; i < NO_OF_EMPLOYEES; i++) {
            printEmployee(employees[i], avgSalary);
        }
    }

    public static void printEmployee(Employee employee, double avgSalary) {
        System.out.println(employee.getLastName() + " " + employee.getFirstName() +
                " zarabia " + (employee.getSalary() - avgSalary) + " powyżej średniej. Płeć " + employee.getGender());
    }

    public static void approachSecond() {
        Scanner reader = new Scanner(System.in);
        final byte NO_OF_EMPLOYEES = 2;
        String[] firstName = new String[NO_OF_EMPLOYEES];
        String[] lastName = new String[NO_OF_EMPLOYEES];
        double[] salary = new double[NO_OF_EMPLOYEES];
        int[] age = new int[NO_OF_EMPLOYEES];
        double sum = 0;
        for (int i = 0; i < NO_OF_EMPLOYEES; i++) {
            System.out.println("Podaj imię " + (i + 1) + " pracownika");
            firstName[i] = reader.nextLine();
            System.out.println("Podaj nazwisko " + (i + 1) + "  pracownika");
            lastName[i] = reader.nextLine();
            System.out.println("Podaj pensję " + (i + 1) + " pracownika");
            salary[i] = Double.valueOf(reader.nextLine());
            sum += salary[i];
            System.out.println("Podaj wiek " + (i + 1) + "  pracownika");
            age[i] = Integer.valueOf(reader.nextLine());
        }
        double avgSalary = sum / NO_OF_EMPLOYEES;
        for (int i = 0; i < NO_OF_EMPLOYEES; i++) {
            printEmployee(firstName[i], lastName[i], salary[i], avgSalary, age[i]);
        }
    }

    public static void approachFirst() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj imię pierwszego pracownika");
        String firstNameFirstEmployee = reader.nextLine();
        System.out.println("Podaj nazwisko pierwszego pracownika");
        String lastNameFirstEmployee = reader.nextLine();
        System.out.println("Podaj pensję pierwszego pracownika");
        double salaryFirstEmployee = Double.valueOf(reader.nextLine());
        System.out.println("Podaj wiek pierwszego pracownika");
        int ageFirstEmployee = Integer.valueOf(reader.nextLine());
        System.out.println("Podaj imię drugiego pracownika");
        String firstNameSecondEmployee = reader.nextLine();
        System.out.println("Podaj nazwisko drugiego pracownika");
        String lastNameSecondEmployee = reader.nextLine();
        System.out.println("Podaj pensję drugiego pracownika");
        double salarySecondEmployee = Double.valueOf(reader.nextLine());
        System.out.println("Podaj wiek drugiego pracownika");
        int ageSecondEmployee = Integer.valueOf(reader.nextLine());
        System.out.println("Podaj imię trzeciego pracownika");
        String firstNameThirdEmployee = reader.nextLine();
        System.out.println("Podaj nazwisko trzeciego pracownika");
        String lastNameThirdEmployee = reader.nextLine();
        System.out.println("Podaj pensję trzeciego pracownika");
        double salaryThirdEmployee = Double.valueOf(reader.nextLine());
        System.out.println("Podaj wiek trzeciego pracownika");
        int ageThirdEmployee = Integer.valueOf(reader.nextLine());
        double avgSalary = (salaryFirstEmployee + salarySecondEmployee + salaryThirdEmployee) / 3;
        printEmployee(firstNameFirstEmployee, lastNameFirstEmployee, salaryFirstEmployee, avgSalary, ageFirstEmployee);
        printEmployee(firstNameSecondEmployee, lastNameSecondEmployee, salarySecondEmployee, avgSalary, ageSecondEmployee);
        printEmployee(firstNameThirdEmployee, lastNameThirdEmployee, salaryThirdEmployee, avgSalary, ageThirdEmployee);
    }

    public static void printEmployee(String firstName, String lastName, double salary, double avgSalary, int age) {
        System.out.println(lastName + " " + firstName + " zarabia " + (salary - avgSalary) + " powyżej średniej. Wiek: " + age);
    }
}
