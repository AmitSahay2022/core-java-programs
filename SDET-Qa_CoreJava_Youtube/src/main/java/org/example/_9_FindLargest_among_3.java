package org.example;

public class _9_FindLargest_among_3 {
    public static void main(String[] args) {
        System.out.println(largest(5,8,9));
    }
    public static int largest(int a,int b,int c){
        int temp=a>b ? a:b;
        return c>temp? c:temp;
    }
}
