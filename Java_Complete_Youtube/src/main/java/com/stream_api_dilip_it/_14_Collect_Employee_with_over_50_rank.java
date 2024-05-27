package com.stream_api_dilip_it;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _14_Collect_Employee_with_over_50_rank {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        List<Employee> listEmpOver50Rank = employees.stream().filter(e -> e.getRank() > 50).collect(Collectors.toList());
        System.out.println(listEmpOver50Rank);
    }
}
