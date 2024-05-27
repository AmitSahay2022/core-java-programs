package com.stream_api_dilip_it;

import java.util.Comparator;
import java.util.List;

public class _10_MinimumRank_EmployeeDetails {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        employees
                .stream()
                .min(Comparator.comparing(Employee::getRank))
                .ifPresent(System.out::println);
    }
}
