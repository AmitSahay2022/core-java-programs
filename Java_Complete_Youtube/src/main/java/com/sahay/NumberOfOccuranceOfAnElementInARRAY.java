package com.sahay;

public class NumberOfOccuranceOfAnElementInARRAY {
    public static void main(String[] args) {
        int[] arr={5,3,4,7,4,3};
        int occurance=0;
        int number=3;
        for (int x:arr) {
            if(number==x)
                occurance++;
        }
        System.out.println(number+" is occured "+occurance+" times");
    }
}
