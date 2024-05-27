package com.stream_api_dilip_it;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _13_ParallelStream {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        List<String> sortedList = employees
                                          .parallelStream()
                                          .map(e->e.getName())
                                          .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
