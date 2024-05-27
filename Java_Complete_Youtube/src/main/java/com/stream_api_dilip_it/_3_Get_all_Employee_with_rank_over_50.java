package com.stream_api_dilip_it;

import java.util.List;

public class _3_Get_all_Employee_with_rank_over_50 {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        employees.stream().filter(e->e.getRank()>=50).forEach(e-> System.out.print(e.getName()+" : "+" "));
    }
}
