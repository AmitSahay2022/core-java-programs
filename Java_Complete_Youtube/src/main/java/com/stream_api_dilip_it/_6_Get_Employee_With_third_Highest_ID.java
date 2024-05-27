package com.stream_api_dilip_it;

import java.util.Comparator;
import java.util.List;

public class _6_Get_Employee_With_third_Highest_ID {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        employees
                .stream()
                .sorted(Comparator.comparing(Employee::getId,Comparator.reverseOrder()))
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
