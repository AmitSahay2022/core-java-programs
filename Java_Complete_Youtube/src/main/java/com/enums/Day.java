package com.enums;

public enum Day {
    MON(true),TUE(true),WED(true),THRU(true),FRI(true),
    SAT(false),SUN(false);
    private boolean isWeekDay;
    Day(boolean isWeekDay){
        this.isWeekDay=isWeekDay;
    }
    public String weekDay(){
        return isWeekDay?"Get Back To Work":"Holyday";
    }
}
