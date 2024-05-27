package com.stream_api_dilip_it;

import java.util.List;
import java.util.stream.Collectors;

public class _21_SummingAll_Employee_Salary {
    public static void main(String[] args) {
        List<Employee> employees = ListOfEmployee.employees();
        Integer totalSalary = employees.stream().collect(Collectors.summingInt(Employee::getSalary));
        System.out.println(totalSalary);
    }
}
