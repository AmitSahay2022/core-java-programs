package com.immutable;

import java.util.ArrayList;
import java.util.List;

public class Test_Immutability {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("9472728287");
        list.add("9572450292");
        Employee employee=new Employee(1,"Amit Kumar",list);
        System.out.println(employee);
        list.add("876");
        System.out.println(employee);
        employee.getContactNumbers().add("8765");
        System.out.println(employee);
    }
}
