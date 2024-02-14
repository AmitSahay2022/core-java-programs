package org.example;

import java.util.Arrays;

public class _7_AddAnyNumbers {
    public static void main(String[] args) {
        System.out.println(adder(4,5,6,7));
    }
    public static int adder(int...x){
        int sum=0;
        //with java 8 only one line is enough
        //int sum1 = Arrays.stream(x).sum();
        //Old Logic
        for(int i:x){
            sum+=i;
        }
        return sum;
    }
}
