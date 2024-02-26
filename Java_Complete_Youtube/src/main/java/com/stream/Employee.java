package com.stream;

import java.util.Date;

public class Employee {
    private String name;
    private double salary;
    private Date joiningDate;
    private String gender;

    public Employee(String name, double salary, Date joiningDate, String gender) {
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", joiningDate=").append(joiningDate);
        sb.append(", gender='").append(gender).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
