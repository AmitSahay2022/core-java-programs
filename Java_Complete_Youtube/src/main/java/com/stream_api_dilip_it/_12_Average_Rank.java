package com.stream_api_dilip_it;

import java.util.List;
import java.util.OptionalDouble;

public class _12_Average_Rank {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        employees
                .stream()
                .map(e -> e.getRank())
                .mapToInt(i -> i)
                .average()
                .ifPresent(i-> System.out.println(i));
    }
}
