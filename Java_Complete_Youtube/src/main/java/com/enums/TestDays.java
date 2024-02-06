package com.enums;

public class TestDays {
    public static void main(String[] args) {
        for(Day d:Day.values()){
            System.out.println(d+" "+d.weekDay());
        }
    }
}
