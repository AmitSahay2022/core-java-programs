package com.stream_api_dilip_it;

import java.util.Map;
import java.util.stream.Collectors;

public class _17_EmpId_and_name_as_map {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        Map<String, String> collect = listOfEmployee.employees().stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(collect);
    }
}
