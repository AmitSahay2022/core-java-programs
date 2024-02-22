package org.example;

public class _38_Fibonacci_Series {
    public static void main(String[] args) {
        fibonacci(10);
    }
    public static void fibonacci(int range){
        if(range==1) {System.out.println(0+" "+1); return;}
        if(range==2) {
            System.out.println(0+" "+1+" "+1);
            return;
        }
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" ");
        int i=3;
        while (i<=range){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
            i++;
        }
    }
}
