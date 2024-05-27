package com.stream_api_dilip_it;

import java.util.List;
import java.util.stream.Collectors;
//map method transform/extrace/convert one type to another type
public class _9_Extract_All_Employee_Names {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        List<String> names = employees.stream()
                .map(e -> e.getName())
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
