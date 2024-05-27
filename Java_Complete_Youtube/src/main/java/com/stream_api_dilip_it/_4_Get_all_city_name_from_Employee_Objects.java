package com.stream_api_dilip_it;

import java.util.List;

public class _4_Get_all_city_name_from_Employee_Objects {
    public static void main(String[] args) {
        ListOfEmployee list=new ListOfEmployee();
        List<Employee> employees = list.employees();
        employees.stream().map(e->e.getCity()).distinct().forEach(s-> System.out.print(s+" "));
    }
}
