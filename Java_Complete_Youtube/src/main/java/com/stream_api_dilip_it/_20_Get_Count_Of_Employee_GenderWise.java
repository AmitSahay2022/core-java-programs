package com.stream_api_dilip_it;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _20_Get_Count_Of_Employee_GenderWise {
    public static void main(String[] args) {
        List<Employee> employees = ListOfEmployee.employees();
        Map<String, Long> empNumberGenderWise = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(empNumberGenderWise);
    }
}
