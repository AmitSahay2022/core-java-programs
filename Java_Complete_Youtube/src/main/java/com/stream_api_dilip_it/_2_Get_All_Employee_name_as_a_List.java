package com.stream_api_dilip_it;

import java.util.List;
import java.util.stream.Collectors;

public class _2_Get_All_Employee_name_as_a_List {
    public static void main(String[] args) {
        ListOfEmployee list=new ListOfEmployee();
        List<Employee> employees = list.employees();
        List<String> collect = employees.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
