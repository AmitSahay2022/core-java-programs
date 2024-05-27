package com.stream_api_dilip_it;

import java.util.Comparator;
import java.util.List;

public class _11_MaximumID_EmployeeDetails {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        employees
                .stream()
                .max(Comparator.comparing(Employee::getId))
                .ifPresent(System.out::println);
    }
}
