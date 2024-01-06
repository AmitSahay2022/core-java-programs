package com.sahay;

class SwitchTutorial {
    public static void main(String[] args) {
        System.out.println(monthName(5));
    }
    public static String monthName(int number){
        return switch (number){
            case 1->"Jan";
            case 2->"Feb";
            case 3->"Mar";
            case 4->"Apr";
            case 5->"May";
            case 6->"Jun";
            case 7->"Jul";
            case 8->"Aug";
            case 9->"Sep";
            case 10->"Oct";
            case 11->"Nov";
            case 12->"Dec";
            default -> "What the ...";
        };
    }
}
