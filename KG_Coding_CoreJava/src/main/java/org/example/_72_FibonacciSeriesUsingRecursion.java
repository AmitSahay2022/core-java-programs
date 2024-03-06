package org.example;
//0 1 1 2 3 5 8 13 21 34 ....
public class _72_FibonacciSeriesUsingRecursion {
    public static void main(String[] args) {
       // fibonacci_(50);
        for(int i=1;i<20;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }

    public static int fibonacci(int range){
        if(range==1) return 0;
        if(range==2) return 1;
        return fibonacci(range-1)+fibonacci(range-2);
    }
    public static void fibonacci_(int range){
        int first=0;
        int second=1;
        System.out.println(first+" "+second);
        while (first+second<range){
            int third=first+second;
            System.out.print(" "+third+" ");
            first=second;
            second=third;
        }
    }

}
