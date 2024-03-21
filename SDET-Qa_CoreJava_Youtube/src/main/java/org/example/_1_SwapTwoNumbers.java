package org.example;

public class _1_SwapTwoNumbers {
    public static void main(String[] args) {
         swap(5,10);
    }
    public static void swap(double a,double b){
        System.out.println("Before Swap: a= "+a+" b= "+b);
        double temp=a;
        a=b;
        b=temp;
        System.out.println("After swap: a= "+a+" b= "+b);
    }
    //Swap without using third variable
    public static void swap(int a,int b){ //if a=5 b=10
        System.out.println("--Swap without third variable--");
        System.out.println("Before swap: a= "+a+" b= "+b);
        a+=b; // than a=15
        b=a-b; //     b=15-10=5
        a=a-b; //     a=15-5=10
        System.out.println("After swap: a= "+a+" b= "+b);
    }
}