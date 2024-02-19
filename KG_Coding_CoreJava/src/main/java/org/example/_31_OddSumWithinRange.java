package org.example;
//1+3+5+7+9
public class _31_OddSumWithinRange {
    public static void main(String[] args) {
        System.out.println("Sum of add numbers till range from 1 to 10: "+sum(10));
    }
    public static int sum(int range){
        int total=0;
        int i=1;
        while (i<=range){
            total=total+i;
            i=i+2;
        }
        return total;
    }
}
