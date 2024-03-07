package org.example;

public class _75_SimpleOne {
    public static void main(String[] args) {
        System.out.println(concatinateAndConvert("Shiv"," Parvati"));
    }
    public static String concatinateAndConvert(String str1,String str2){
        String result=str1.concat(str2);
        return result.toUpperCase();
    }
}
