package com.stream_api_dilip_it;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _19_Dept_Wise_Total_salary {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        Map<String, IntSummaryStatistics> collect = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.summarizingInt(Employee::getSalary)));
        System.out.println(collect);
    }
}
