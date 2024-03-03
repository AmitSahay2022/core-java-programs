package org.example;

public class _60_MonthOfTheYearBasedOnNumber_Switch {
    public static void main(String[] args) {
        System.out.println(getMonthName(5));
    }
    public static String getMonthName(int n){
        return switch (n){
            case 1->"January";
            case 2->"February";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"July";
            case 8->"August";
            case 9->"Septumber";
            case 10->"Octuber";
            case 11->"November";
            case 12->"December";
            default -> "Invalid";
        };
    }
}
