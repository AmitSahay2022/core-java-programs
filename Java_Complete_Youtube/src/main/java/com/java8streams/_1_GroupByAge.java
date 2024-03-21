package com.java8streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class _1_GroupByAge {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDB.allEmp();
       // Map<Integer, Set<Employee>> groupByAge =employees.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.toSet()));
        Map<Integer, List<Employee>> groupByAge = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(groupByAge);
    }
}
