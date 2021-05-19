package com.company.Bonus;

import java.math.BigDecimal;

public class Employee extends Human {
    private BigDecimal salary;

    public Employee(String firstName, String lastName, char gender, BigDecimal salary) {
        super(firstName, lastName, gender);
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, char gender) {
        super(firstName, lastName, gender);
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
        if (isWoman(firstName) && salary != null) {
            salary = salary.multiply(new BigDecimal("1.1"));
        }
    }

    @Override
    public String toString() {
        return getFirstName();
    }

    private Boolean isWoman(String firstName) {
        return firstName != null && firstName.length() > 0 && firstName.charAt(firstName.length() - 1) == 'a';
    }
}
