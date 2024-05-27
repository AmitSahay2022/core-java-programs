package com.stream_api_dilip_it;

import java.util.List;

public class _5_Count_Number_of_Employee_with_Over_50_Rank {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        List<Employee> employees = listOfEmployee.employees();
        long count = employees.stream().filter(e -> e.getRank() >= 50).count();
        System.out.println(count);

        //Get first Three Employees
        employees.stream().limit(3).forEach(e-> System.out.println(e));

    }
}
