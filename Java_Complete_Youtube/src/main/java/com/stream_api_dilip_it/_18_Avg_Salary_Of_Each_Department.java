package com.stream_api_dilip_it;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _18_Avg_Salary_Of_Each_Department {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        Map<String, Double> avgSalByDept = employees.stream()
                                                    .collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingInt(Employee::getSalary)));
        System.out.println(avgSalByDept);
    }
}
