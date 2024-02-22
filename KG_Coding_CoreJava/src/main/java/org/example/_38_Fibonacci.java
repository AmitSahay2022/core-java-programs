package org.example;

public class _38_Fibonacci {
    public static void main(String[] args) {
        fibo(50);
    }
    public static void fibo(int range){
        int first=0,second=1;
        int third=first+second;
        System.out.print(first+" "+second+" "+third+" ");

        while(third<=range){
            first=second;
            second=third;
            third=first+second;
            if(third<=range)
              System.out.print(third+" ");
        }
    }
}
