package com.stream_api_dilip_it;

import java.util.Comparator;
import java.util.List;

public class _8_Sorted {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        employees.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);
    }
}
