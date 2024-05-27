package com.stream_api_dilip_it;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _19_Dept_wise_total_sal {
    public static void main(String[] args) {
        List<Employee> employees = ListOfEmployee.employees();
        Map<String, Double> totalSalByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.summingDouble(Employee::getSalary)));
        System.out.println(totalSalByDept);
    }
}
