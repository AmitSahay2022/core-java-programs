package com.lambda;

public class FactorialOldApproach {
    public static int fact(int number){
        if(number<=0 || number==1) return 1;
        int result=1;

        for(int i=1;i<=number;i++){
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

}
