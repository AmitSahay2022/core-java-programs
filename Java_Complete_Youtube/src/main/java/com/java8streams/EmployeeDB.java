package com.java8streams;

import java.util.List;

public class EmployeeDB {
    public static List<Employee> allEmp(){
        return List.of(new Employee("Ram",30),new Employee("Shyam",35),
                new Employee("Sita",30),new Employee("Radha",35));
    }
}
