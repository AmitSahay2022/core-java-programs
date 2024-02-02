package com.sahay;

public class _89_MultipleStringToSingleString {
    public static String addStrings(String...str){
        StringBuilder builder=new StringBuilder();
        for(String s:str){
            builder.append(s);
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        String result = addStrings("Amit", "Kumar", "Java", "Backend", "Developer", "5 years", "Experience");
        System.out.println(result);
    }
}
