package com.sahay;

class FibonacciSeries_Recurson {
    public static void main(String[] args) {
        //fibonacci(10);
        for(int i=1;i<=10;i++){
            System.out.print(fibonacciRecurson(i)+" ");
        }
    }

    //Still i have not understand the logic how?
    public static int fibonacciRecurson(int num){

        if(num==1){
            return 0;
        }
        if(num==2){
            return 1;
        }
        return fibonacciRecurson(num-1)+fibonacciRecurson(num-2);
    }


















    public static void fibonacci(int range){
        if(range==1){
            System.out.print(0);
        }
        if(range==2){
            System.out.print(0+" "+1);
        }
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        int i=3;
        while(i<=range){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
            i++;
        }
    }
}
