package org.example;

public class _10_Generate_FibonacciSeries {
    public static void main(String[] args) {
        fibo(50);
    }
    public static void fibo(int range){
        int first=0;
        int second =1;
        System.out.print(first+" "+second);
        while (first+second<range){
            int third=first+second;
            System.out.print(" "+third);
            first=second;
            second=third;
        }
    }
    //--------Using Recursion------------?
    public static void fibonacy(int range){
        int first=0;
        int second=1;
        if(range==1) return ;
    }
}
