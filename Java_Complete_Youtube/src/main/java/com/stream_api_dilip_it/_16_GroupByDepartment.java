package com.stream_api_dilip_it;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _16_GroupByDepartment {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        Map<String, List<Employee>> groupByDept = listOfEmployee.employees().stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(groupByDept);
    }
}
