package com.stream_api_dilip_it;

public class _15_GetUniqueDepartmentName {
    public static void main(String[] args) {
        ListOfEmployee listOfEmployee=new ListOfEmployee();
        listOfEmployee.employees().stream().map(e->e.getDept()).distinct().forEach(d-> System.out.println(d));
    }
}
