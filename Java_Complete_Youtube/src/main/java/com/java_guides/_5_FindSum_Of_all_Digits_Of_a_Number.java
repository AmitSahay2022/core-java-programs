package com.java_guides;

public class _5_FindSum_Of_all_Digits_Of_a_Number {
    public static void main(String[] args) {
        System.out.println(sum(456));
    }
    public static int sum(int num){
        int total=0;
        while (num!=0){
            total+=num%10;
            num/=10;
        }
        return total;
    }
}
