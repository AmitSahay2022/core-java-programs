package com.stream_api_dilip_it;

import java.util.List;

public class _7_If_Any_lessthan_Rank_10 {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        boolean result = employees.stream().anyMatch(e -> e.getRank() < 10);
        System.out.println(result);
    }
}
